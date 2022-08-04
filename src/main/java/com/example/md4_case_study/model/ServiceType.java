package com.example.md4_case_study.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ServiceType {
     @Id
    private int id;


    private String nameService;


}
