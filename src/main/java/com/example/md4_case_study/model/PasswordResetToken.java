package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
public class PasswordResetToken {
    private static final int EXPIRATION = 60 * 24;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idToken;
    private String token;
    @OneToOne(targetEntity = AppUser.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "idUser")
    private AppUser appUser;
    private Date expiryDate;

}
