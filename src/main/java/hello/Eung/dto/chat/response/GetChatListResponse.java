package hello.Eung.dto.chat.response;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class GetChatListResponse {
    private List<ChatResponse> chats;
}