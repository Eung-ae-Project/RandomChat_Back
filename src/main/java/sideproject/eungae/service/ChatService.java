package sideproject.eungae.service;

import sideproject.eungae.dto.chat.response.ChatBoxData;
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
        List<String> hashtag = new ArrayList<>();
        hashtag.add("개발자");
        hashtag.add("코딩");
        hashtag.add("프로그래밍");
        hashtag.add("치킨집사장");
        hashtag.add("공부하기싫다");
        ChatBoxData one = new ChatBoxData(1,"백엔드 개발자끼리 소통해요~",hashtag,12);
        ChatBoxData two = new ChatBoxData(2,"백엔드",hashtag,32);
        ChatBoxData two3 = new ChatBoxData(3,"백",hashtag,33);
        ChatBoxData two4 = new ChatBoxData(4,"엔",hashtag,35);
        ChatBoxData two5 = new ChatBoxData(5,"드",hashtag,42);
        List<ChatBoxData> chatList = new ArrayList<>();
        chatList.add(one);
        chatList.add(two);
        chatList.add(two3);
        chatList.add(two4);
        chatList.add(two5);

        return new GetChatListResponse(chatList);
    }
}
