package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUser;
    private String nameUser;
    private String cccdUser;
    private String phoneUser;
    private String passWordUser;
    private String email;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;
}