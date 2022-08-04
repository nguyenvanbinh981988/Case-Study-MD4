package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.Drink;
import com.example.md4_case_study.service.IDrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class APIDrink {
    @Autowired
    IDrinkService drinkService;
    @GetMapping("/drinks")
    public ResponseEntity<List<Drink>> listDrinks(){
        return new ResponseEntity<>(drinkService.listDrink(), HttpStatus.OK);
    }
}
