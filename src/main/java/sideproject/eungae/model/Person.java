package sideproject.eungae.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Getter
@NoArgsConstructor(access= AccessLevel.PROTECTED)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private boolean gender;
    private String mbti;
    private String nickname;
    private LocalDate birth;
    private LocalDate createdAt;
    private LocalDate updatedAt;



    public Person(String email, String password, String mbti,String nickname, LocalDate birth, boolean gender) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.gender = gender;
        this.birth = birth;
        this.mbti = mbti;

        this.createdAt = LocalDate.now();
        this.updatedAt = LocalDate.now();
    }
    public void updatePerson(
            String password,
            String mbti,
            String nickname,
            LocalDate birth,
            boolean gender
    ) {
        this.password = password;
        this.gender = gender;
        this.birth = birth;
        this.nickname = nickname;
        this.mbti = mbti;
        this.updatedAt = LocalDate.now();
    }
}