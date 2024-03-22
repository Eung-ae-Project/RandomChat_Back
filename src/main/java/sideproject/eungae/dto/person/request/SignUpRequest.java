package sideproject.eungae.dto.person.request;
import lombok.Data;

import java.util.Date;

@Data
public class SignUpRequest {
    private String name;
    private String email;
    private String password;
    private boolean gender;
    private String nickname;
    private String mbti;
    private String birth;

}
