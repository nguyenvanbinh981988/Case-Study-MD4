package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.Room;
import com.example.md4_case_study.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class APIRoom {
    @Autowired
    IRoomService roomService;
    @GetMapping("/rooms")
    public List<Room> rooms(){
        return roomService.listRoom();
    }
}
