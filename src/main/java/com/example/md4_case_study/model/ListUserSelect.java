package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ListUserSelect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private AppUser appUser;
    @ManyToOne
    private  Drink drink;

    private  String nameDrink;

    private int quantity;
}
