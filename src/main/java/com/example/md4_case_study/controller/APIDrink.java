package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.*;
import com.example.md4_case_study.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class APIDrink {
    @Autowired
    IDrinkServiceService drinkService;

    @Autowired
    IListUserSelectService listUserSelectService;

    @Autowired
    INotificationConfirmService notificationConfirmService;

    @Autowired
    IOderConFirm oderConFirm;

    @Autowired
    IAppUserService appUserService;

    @Autowired
    IQuantityNotificationService quantityNotificationService;

    @Autowired
    INotificationAdminService notificationAdminService;
    @GetMapping("/drinks")
    public ResponseEntity<List<Drink>> listDrinks(){
        return new ResponseEntity<>(drinkService.listDrink(), HttpStatus.OK);
    }

    @PostMapping("/pay/{idUser}")
    public void save(@RequestBody  List<ListUserSelect> listUserSelects,@PathVariable long idUser){
        LocalDateTime timeOder= java.time.LocalDateTime.now();
        notificationAdminService.saveNotificationAdmin(new NotificationAdmin(appUserService.findAppUserById(idUser).get(),String.valueOf(timeOder)));
        int b = quantityNotificationService.countQuantityNotificationUser(1)+1;
        quantityNotificationService.updateStatusConfirmAdmin(b);
        double totalMoneyOder =  0;
           for (ListUserSelect userSelect : listUserSelects){
               userSelect.setTimeSelect(String.valueOf(timeOder));
               listUserSelectService.save(userSelect);
               int a = drinkService.quantityDrink(userSelect.getDrink().getIdDrink()) -userSelect.getQuantity();
               drinkService.updateQuantity(userSelect.getDrink().getIdDrink(),a);
               totalMoneyOder += drinkService.findDrinkById(userSelect.getDrink().getIdDrink()).get().getPriceDrink()* (userSelect.getQuantity());
           }
        System.out.println("totalMoney :"+totalMoneyOder);
           oderConFirm.saveOderConfirm(new OderConfirm(appUserService.findAppUserById(idUser).get(),listUserSelects.size(),totalMoneyOder,String.valueOf(timeOder)));
    }
    @GetMapping("/notification/{idUser}")
    public ResponseEntity<List<NotificationConfirm>> listNotificationConfirmByIdUser(@PathVariable int idUser){
        return  new ResponseEntity<>(notificationConfirmService.notificationConfirmByIdUser(idUser),HttpStatus.OK);
    }
    @GetMapping("/quantityNotication/{idUser}")
    public int quantityNotication(@PathVariable int idUser){
     return quantityNotificationService.countQuantityNotificationUser(idUser);
    }
    @GetMapping("/updateQuantiyNorificationTo0/{idUser}")
    public void updateStatusConfirmTo0(@PathVariable int idUser){
         quantityNotificationService.updateStatusConfirmTo0(idUser);
    }

}