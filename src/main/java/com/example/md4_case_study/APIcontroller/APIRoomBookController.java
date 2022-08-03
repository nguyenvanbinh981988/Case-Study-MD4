package com.example.md4_case_study.APIcontroller;

import com.example.md4_case_study.model.RoomBook;
import com.example.md4_case_study.service.RoomBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/roomBooks")
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
    public String delete(@PathVariable long id){
        roomBookService.delete(id);
        return "OK";
    }


    @PostMapping("/img")
    public String img(@RequestParam MultipartFile file){
        String name = file.getOriginalFilename();
        try {
            FileCopyUtils.copy(file.getBytes(),new File("D:/00. Codegym/04. Module 4/101. Case Study/MD4_CASE_STUDY_FE/royal-master/image/"+name));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "/image/" + name;
    }



}
