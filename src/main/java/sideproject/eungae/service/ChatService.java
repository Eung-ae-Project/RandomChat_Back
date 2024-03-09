package sideproject.eungae.service;

import sideproject.eungae.dto.chat.response.ChatResponse;
import sideproject.eungae.dto.chat.response.GetChatListResponse;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatService {

    public GetChatListResponse getChatList(){
//        Person person = authService.findById(SecurityUtil.getCurrentUserId());
//        List<ChatResponse> chatList = chatRepository.findAllByFirstPersonOrSecondPersonOrderByCreatedAt(person, person).stream().map(chat ->
//                findChat(person, chat)).toList();
        List<ChatResponse> chatList = new ArrayList<>();
        return new GetChatListResponse(chatList);
    }
}
