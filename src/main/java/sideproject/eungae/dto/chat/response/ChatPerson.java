package sideproject.eungae.dto.chat.response;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ChatPerson {
    private Long personId;
    private boolean gender;
}