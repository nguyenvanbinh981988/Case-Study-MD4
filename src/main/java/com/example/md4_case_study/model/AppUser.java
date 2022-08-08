package com.example.md4_case_study.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@Builder
@AllArgsConstructor


public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idUser;
    private String nameUser;
    private String cccdUser;
    private String phoneUser;
    private String email;
    private String passwordUser;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;
    public AppUser() {
    }
}
