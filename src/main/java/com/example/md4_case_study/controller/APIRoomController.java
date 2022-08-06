package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.Room;

import com.example.md4_case_study.service.iplm.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/room")
@CrossOrigin("*")

public class APIRoomController {
    @Autowired
    RoomService roomService;

    @GetMapping
    public Page<Room> getPage(){
        return roomService.getAll(PageRequest.of(0,5));
    }

    @PostMapping
    public Room save(@RequestBody Room room){
        roomService.save(room);
        return room;
    }

    @PutMapping
    public Room update(@RequestBody Room room){
        roomService.save(room);
        return room;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long idRoom){
        roomService.delete(idRoom);
        return "OK";
    }

}
