package com.example.md4_case_study.service;

import com.example.md4_case_study.model.Drink;

import java.util.List;
import java.util.Optional;

public interface IDrinkServiceService {

    List<Drink> listDrink();

    int quantityDrink(int id);

    void updateQuantity(int id,int quantity);

    Optional<Drink> findDrinkById(int id);
}
