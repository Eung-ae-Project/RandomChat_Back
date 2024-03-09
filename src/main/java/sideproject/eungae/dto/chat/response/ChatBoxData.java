package sideproject.eungae.dto.chat.response;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatBoxData {
    private int index;
    private String title;
    private List<String> hashtag;
    private int lastChat;
}