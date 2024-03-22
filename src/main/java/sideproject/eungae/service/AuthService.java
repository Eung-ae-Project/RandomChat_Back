package sideproject.eungae.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sideproject.eungae.dto.person.request.SignUpRequest;
import sideproject.eungae.dto.person.response.SignUpResponse;
import sideproject.eungae.exception.CustomException;
import sideproject.eungae.exception.ErrorCode;
import sideproject.eungae.model.Person;
import sideproject.eungae.repository.PersonRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthService {
    private final BCryptPasswordEncoder encoder;
    private final PersonRepository personRepository;
    public boolean findSameLogin(String email){
        return personRepository.existsByEmail(email);
    }
    @Transactional
    public SignUpResponse signUp(SignUpRequest signUpRequest){
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]{8,20}$");
        if (findSameLogin(signUpRequest.getEmail()) ||
                !pattern.matcher(signUpRequest.getPassword()).find()){
            throw new CustomException(ErrorCode.INVALID_SIGNUP);
        }
        String encodedPassword = encoder.encode(signUpRequest.getPassword());

        Person person = personRepository.save(new Person(signUpRequest.getEmail(), encodedPassword,
                signUpRequest.getMbti(), signUpRequest.getNickname(),
                LocalDate.parse(signUpRequest.getBirth(), DateTimeFormatter.ISO_DATE), signUpRequest.isGender()));
        return new SignUpResponse(person.getId());
    }
    @Transactional
    public ResponseEntity<String> signIn(SignInRequest signInRequest){
        String encodedPassword = findByLogin(signInRequest.getLogin()).getPassword();
        if (!encoder.matches(signInRequest.getPassword(), encodedPassword)){
            throw new CustomException(ErrorCode.WRONG_LOGIN_INPUT);
        }
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                findByLogin(signInRequest.getLogin()).getId(), encodedPassword);
        Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
        TokenDto tokenDto = jwtTokenProvider.generateToken(authentication);
        Person person = findById(Long.valueOf(authentication.getName()));
        return refreshTokenService.saveToken(tokenDto, person);
    }
}

