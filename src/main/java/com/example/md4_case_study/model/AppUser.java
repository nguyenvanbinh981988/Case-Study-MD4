package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private List<Role> roles;
}
