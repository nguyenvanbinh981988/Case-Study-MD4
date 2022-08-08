package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDrink;

    private String nameDrink;

    private String imgDrink;

    private double priceDrink;

    private int quantityDrink;

    private boolean statusDrink;

    @ManyToOne
    private ServiceType serviceType;
}
