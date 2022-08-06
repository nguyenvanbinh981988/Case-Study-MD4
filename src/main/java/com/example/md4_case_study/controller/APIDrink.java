package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.Drink;
import com.example.md4_case_study.model.ListUserSelect;
import com.example.md4_case_study.service.IDrinkService;
import com.example.md4_case_study.service.IListUserSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class APIDrink {
    @Autowired
    IDrinkService drinkService;

    @Autowired
    IListUserSelect listUserSelectService;
    @GetMapping("/drinks")
    public ResponseEntity<List<Drink>> listDrinks(){
        return new ResponseEntity<>(drinkService.listDrink(), HttpStatus.OK);
    }

    @PostMapping("/pay")
    public void save(@RequestBody  List<ListUserSelect> listUserSelects){
       try{
           for (ListUserSelect userSelect : listUserSelects){
               listUserSelectService.save(userSelect);
           }
       }
       catch (Exception e){

       }
    }
}
