package sideproject.eungae.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Getter
@NoArgsConstructor(access= AccessLevel.PROTECTED)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;
    private boolean gender;
    private String mainAddress;
    private String subAddress;
    private LocalDate birth;
    private Double latitude;
    private Double longitude;
    private LocalDate createdAt;
    private LocalDate updatedAt;



    public Person(String login, String password, String mainAddress, String subAddress, LocalDate birth, boolean gender, Double latitude, Double longitude) {
        this.login = login;
        this.password = password;
        this.gender = gender;
        this.mainAddress = mainAddress;
        this.subAddress = subAddress;
        this.birth = birth;
        this.latitude = latitude;
        this.longitude = longitude;
        this.createdAt = LocalDate.now();
        this.updatedAt = LocalDate.now();
    }
    public void updatePerson(
            String password,
            String mainAddress,
            String subAddress,
            LocalDate birth,
            boolean gender,
            Double latitude,
            Double longitude
    ) {
        this.password = password;
        this.gender = gender;
        this.mainAddress = mainAddress;
        this.subAddress = subAddress;
        this.birth = birth;
        this.latitude = latitude;
        this.longitude = longitude;
        this.updatedAt = LocalDate.now();
    }
}