package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.Picture;
import com.example.md4_case_study.service.iplm.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/picture")
@CrossOrigin("*")
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
