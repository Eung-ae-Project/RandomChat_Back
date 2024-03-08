package hello.Eung.dto.chat.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.lang.Nullable;


@Data
@AllArgsConstructor
public class ChatResponse {
    private Long id;
    @Nullable
    private ChatPerson person;
}