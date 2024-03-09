package sideproject.eungae.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.lang.Nullable;

@Entity
@Getter
@NoArgsConstructor(access= AccessLevel.PROTECTED)
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "firstPerson_id")
    @Nullable
    private Person firstPerson;
    @ManyToOne
    @JoinColumn(name = "secondPerson_id")
    @Nullable
    private Person secondPerson;
    private LocalDate createdAt;
    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ChatMessage> messages = new ArrayList<>();

    public Chat(Person firstPerson, Person secondPerson) {
        this.firstPerson = firstPerson;
        this.secondPerson = secondPerson;
        this.createdAt = LocalDate.now();
    }
    public void deletePerson(Person person){
        if (person == firstPerson){
            this.firstPerson = null;
        } else {
            this.secondPerson = null;
        }
    }
}