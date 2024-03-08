package hello.login.domain.login;

import hello.login.domain.user.SiteUser;
import hello.login.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserRepository userRepository;

    /**
     * @param Email
     * @param password
     * @return null이면 로그인 실패
     */

    public SiteUser login(String Email, String password) {
//        return userRepository.findByLoginId(Email)
//                .filter(m -> m.getPassword().equals(password))
//                .orElse(null);
//    }
        return null;
    }
}
