package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.Room;

import com.example.md4_case_study.service.iplm.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/Room")
    public Room findByNameRoom(@RequestParam(defaultValue = "") String nameRoom){
        return roomService.findByNameRoom(nameRoom);
    }

    @GetMapping("/{id}")
    public Room findByIdRoom(@PathVariable Long id){
        return roomService.findById(id).get();
    }

//    @GetMapping("/findRoom")
//    public List<Room> findRoomToB(@PathVariable int roomType,@PathVariable String roomKind,@PathVariable int minPriceRoom,@PathVariable int maxPriceRoom){
//        return roomService.findAllRoomB(roomType,roomKind,minPriceRoom,maxPriceRoom);
//    }

}
