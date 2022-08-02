package com.example.md4_case_study.APIcontroller;

import com.example.md4_case_study.model.RoomBook;
import com.example.md4_case_study.repositorys.IRoomBookRepo;
import com.example.md4_case_study.services.IRoomBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController

public class RoomBookAPI {
    @Autowired
    IRoomBookService roomBookService;
@GetMapping("/showBook")
public Page<RoomBook> getAll(@RequestParam(defaultValue = "0") int page){
    return roomBookService.getAll(PageRequest.of(page,4));
}
    @GetMapping("/{id}")
    public RoomBook findById(@PathVariable long id){
        return roomBookService.findById(id);
    }
    @PostMapping("/createBook")
    public RoomBook save(@RequestBody RoomBook roomBook){
        return roomBookService.save(roomBook);
    }
    @PutMapping("/editBook")
    public RoomBook edit(@RequestBody RoomBook roomBook){
        return roomBookService.save(roomBook);
    }
    @DeleteMapping("/deleteBook/{id}")
    public void delete(@PathVariable long id){
        roomBookService.delete(id);
    }

}
