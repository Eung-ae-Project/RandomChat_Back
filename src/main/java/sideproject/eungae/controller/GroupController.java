package sideproject.eungae.controller;

import sideproject.eungae.dto.chat.response.GetChatListResponse;
import sideproject.eungae.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class GroupController {
    private final ChatService chatService;

    @GetMapping("/group/**")
    public GetChatListResponse getChatList(){
        System.out.println("group!!");
        return chatService.getChatList();
    }

}