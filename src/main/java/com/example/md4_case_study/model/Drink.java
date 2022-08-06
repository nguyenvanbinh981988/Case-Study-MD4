package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Drink {
    @Id
    private int idDrink;

    private String nameDrink;

    private String imgDrink;

    private double priceDrink;

    private int quantityDrink;

    private boolean statusDrink;

    @ManyToOne
    private ServiceType serviceType;
}
