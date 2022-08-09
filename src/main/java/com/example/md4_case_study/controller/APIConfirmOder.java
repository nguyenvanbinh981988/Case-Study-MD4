package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.ListUserSelect;
import com.example.md4_case_study.model.NotificationAdmin;
import com.example.md4_case_study.model.NotificationConfirm;
import com.example.md4_case_study.model.OderConfirm;
import com.example.md4_case_study.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin")
public class APIConfirmOder {
    @Autowired
    IOderConFirm oderConFirm;

    @Autowired
    IListUserSelectService listUserSelect;

    @Autowired
    INotificationConfirmService notificationConfirmService;

    @Autowired
    IQuantityNotificationService quantityNotificationService;

    @Autowired
    INotificationAdminService notificationAdminService;
    @GetMapping("/listOderConfirm")
    public ResponseEntity<List<OderConfirm>> oderConfirmList(){
        return new ResponseEntity<>(oderConFirm.listOderConfirm(), HttpStatus.OK);
    }
   @GetMapping("/listNotificationAdmin")
   public ResponseEntity<List<NotificationAdmin>> listNotificationAdmin(){
       return new ResponseEntity<>(notificationAdminService.listNotificationAdmin(), HttpStatus.OK);
   }
    @GetMapping("/listUserSelectById/{idUser}")
    public ResponseEntity<List<ListUserSelect>> listUserSelectById(@PathVariable int idUser){
        return new ResponseEntity<>(listUserSelect.listUserSelectById(idUser),HttpStatus.OK);
    }@GetMapping("/detailListOderConfirm/{idUser}/{time}")
    public ResponseEntity<List<ListUserSelect>> listUserSelectByIdAndBySelect(@PathVariable int idUser, @PathVariable String time){
        return new ResponseEntity<>(listUserSelect.listUserSelectByIdAndBySelect(idUser,time),HttpStatus.OK);
    }
    @PostMapping("/confirmOder/{time}")
    public void saveNotificationConfirm(@RequestBody NotificationConfirm notificationConfirm,@PathVariable String time){
        notificationAdminService.updateStatusConfirmAdmin((int) notificationConfirm.getAppUser().getIdUser(),time);
        int quantityNotificationUser=  (quantityNotificationService.countQuantityNotificationUser((int) notificationConfirm.getAppUser().getIdUser()))+1;
        quantityNotificationService.updateStatusConfirm((int) notificationConfirm.getAppUser().getIdUser(),quantityNotificationUser);
        oderConFirm.updateStatusConfirm((int) notificationConfirm.getAppUser().getIdUser(),time);
        listUserSelect.updateStatusConfirm((int) notificationConfirm.getAppUser().getIdUser(),time);
        notificationConfirm.setTimeSelectOfUser(time);
        notificationConfirm.setTimeNotification(String.valueOf(LocalDateTime.now()));
        notificationConfirmService.saveNotificationConfirm(notificationConfirm);
    }
    @GetMapping("/updateQuantiyNorificationTo0Admin")
    public void updateStatusConfirmTo0Admin(){
        quantityNotificationService.updateStatusConfirmTo0Admin();
    }
    @GetMapping("/quantityNoticationAdmin")
    public int quantityNoticationAdmin(){
        return quantityNotificationService.countQuantityNotificationUser(1);
    }
}


