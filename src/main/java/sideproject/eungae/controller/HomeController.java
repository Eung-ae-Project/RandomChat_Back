package sideproject.eungae.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import sideproject.eungae.dto.user.SiteUser;
import sideproject.eungae.repository.UserRepository;
import sideproject.eungae.session.SessionManager;
import sideproject.eungae.session.SessionConst;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/api")
public class HomeController {

    private final UserRepository userRepository;
    private final SessionManager sessionManager;

    @GetMapping("/")
    public String homeLoginV3Spring(
            @SessionAttribute(name = SessionConst.LOGIN_USER, required = false) SiteUser loginUser, Model model) {

        //세션에 회원 데이터가 없으면 home
        if (loginUser == null) {
            return "home";
        }

        //세션이 유지되면 로그인으로 이동
        model.addAttribute("user", loginUser);
        return "loginHome";
    }
}