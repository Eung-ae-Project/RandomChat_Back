package sideproject.eungae.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 1000)
    private String content;
    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;
    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Person sender;
    private LocalDateTime createdAt;

    public ChatMessage(Chat chat, Person sender, String content) {
        this.content = content;
        this.chat = chat;
        this.sender = sender;
        this.createdAt = LocalDateTime.now();
    }
}