package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPicture;
    private String img;
}
