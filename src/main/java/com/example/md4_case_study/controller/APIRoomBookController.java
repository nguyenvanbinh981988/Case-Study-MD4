package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.Room;
import com.example.md4_case_study.model.RoomBook;
import com.example.md4_case_study.service.iplm.RoomBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/USER/roomBook")
@CrossOrigin("*")
public class APIRoomBookController {
    @Autowired
    RoomBookService roomBookService;

    @GetMapping
    public Page<RoomBook> getPage(){
        return roomBookService.getAll(PageRequest.of(0,5));
    }

    @PostMapping
    public RoomBook save(@RequestBody RoomBook roomBook){
        roomBookService.save(roomBook);
        return roomBook;
    }

    @PutMapping
    public RoomBook update(@RequestBody RoomBook roomBook){
        roomBookService.save(roomBook);
        return roomBook;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long idRoomBook){
        roomBookService.delete(idRoomBook);
        return "OK";
    }

    @GetMapping("{id}")
    public List<RoomBook> searchRoomBook(@PathVariable Long id){
       return roomBookService.findByRoom(id);
    }

}
