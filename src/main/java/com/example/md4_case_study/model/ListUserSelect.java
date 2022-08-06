package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class ListUserSelect {
    @Id
    private int id;

    private int idAppUser;

    private int idDrink;

    private  String nameDrink;

    private int quantity;
}
