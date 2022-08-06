package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.Picture;
import com.example.md4_case_study.model.RoomBook;
import com.example.md4_case_study.service.iplm.PictureService;
import com.example.md4_case_study.service.iplm.RoomBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

public class APIPictureController {
    @Autowired
    PictureService pictureService;

    @GetMapping
    public Page<Picture> getPage(){
        return pictureService.getAll(PageRequest.of(0,5));
    }

    @PostMapping
    public Picture save(@RequestBody Picture picture){
        pictureService.save(picture);
        return picture;
    }

    @PutMapping
    public Picture update(@RequestBody Picture picture){
        pictureService.save(picture);
        return picture;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long idPicture){
        pictureService.delete(idPicture);
        return "OK";
    }

}
