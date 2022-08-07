package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.ListUserSelect;
import com.example.md4_case_study.model.NotificationConfirm;
import com.example.md4_case_study.model.OderConfirm;
import com.example.md4_case_study.service.IListUserSelectService;
import com.example.md4_case_study.service.INotificationConfirmService;
import com.example.md4_case_study.service.IOderConFirm;
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

    @GetMapping("/listOderConfirm")
    public ResponseEntity<List<OderConfirm>> oderConfirmList(){
        return new ResponseEntity<>(oderConFirm.listOderConfirm(), HttpStatus.OK);
    }
    @GetMapping("/detailListOderConfirm/{idUser}/{time}")
    public ResponseEntity<List<ListUserSelect>> listUserSelectByIdAndBySelect(@PathVariable int idUser, @PathVariable String time){
        return new ResponseEntity<>(listUserSelect.listUserSelectByIdAndBySelect(idUser, time),HttpStatus.OK);
    }
    @PostMapping("/confirmOder")
    public void saveNotificationConfirm(@RequestBody NotificationConfirm notificationConfirm){
        notificationConfirm.setTimeNotification(java.time.LocalDateTime.now());
        notificationConfirmService.saveNotificationConfirm(notificationConfirm);
    }
}


