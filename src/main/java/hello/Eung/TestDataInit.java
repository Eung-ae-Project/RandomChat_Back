//package hello.login;
//
//import hello.login.domain.user.SiteUser;
//import hello.login.domain.user.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//
//@Component
//@RequiredArgsConstructor
//public class TestDataInit {
//    private final UserRepository userRepository;
//
//    /**
//     * 테스트용 데이터 추가
//     */
//    @PostConstruct
//    public void init() {
//        SiteUser siteUser = new SiteUser();
//        siteUser.setEmail("admin");
//        siteUser.setPassword("password");
//        siteUser.setNickname("관리자");
//        userRepository.save(siteUser);
//    }
//}