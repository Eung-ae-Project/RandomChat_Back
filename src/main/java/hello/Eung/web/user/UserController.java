package hello.login.web.user;

import hello.login.domain.user.SiteUser;
import hello.login.domain.user.UserAddForm;
import hello.login.domain.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {
//    private final UserRepository userRepository;
    private final UserService userService;

    @GetMapping("/users/add")
    public String addForm(UserAddForm userAddForm){
        return "users/addUserForm";
    }

    @PostMapping("/users/add")
    public String signup(@Valid UserAddForm userAddForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "users/addUserForm";
        }

        if (!userAddForm.getPassword().equals(userAddForm.getPasswordCheck())) {
            bindingResult.rejectValue("passwordCheck", "passwordInCorrect",
                    "2개의 패스워드가 일치하지 않습니다.");
            return "users/addUserForm";
        }

        userService.create(userAddForm.getNickname(),
                userAddForm.getEmail(), userAddForm.getPassword());

        return "redirect:/";
    }
}