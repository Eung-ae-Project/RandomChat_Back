package hello.Eung.controller;

import hello.Eung.dto.chat.response.GetChatListResponse;
import hello.Eung.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ChatController {
    private final ChatService chatService;

    @GetMapping("/chat")
    public GetChatListResponse getChatList(){
        System.out.println("chat!!");
        return chatService.getChatList();
    }

}