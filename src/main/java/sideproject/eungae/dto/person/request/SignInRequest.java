package sideproject.eungae.dto.person.request;


import lombok.Data;

@Data
public class SignInRequest {
    private String email;
    private String password;
}