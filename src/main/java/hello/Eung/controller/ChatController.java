//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/api")
//public class ChatController {
//    private final ChatService chatService;
//    private final ChatAndMessageService chatAndMessageService;
//
//    @GetMapping("/chat")
//    public GetChatListResponse getChatList(){
//        return chatService.getChatList();
//    }
//
//    @GetMapping("/chat/{chatId}")
//    public ResponseEntity<ChatDetailResponse> enterChat(@PathVariable Long chatId){
//        return chatAndMessageService.enterChat(chatId);
//    }
//
//    @DeleteMapping("/chat/{chatId}")
//    public ResponseEntity<String> deleteChat(@PathVariable Long chatId){
//        return chatService.deleteChat(chatId);
//    }
//}