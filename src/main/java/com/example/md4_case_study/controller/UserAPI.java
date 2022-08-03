package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.AppUser;
import com.example.md4_case_study.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UserAPI {
    @Autowired
    IUserService iUserService;

    @GetMapping
    public List<AppUser> getAll(){
        return iUserService.getAll();
    }

    @PostMapping
    public AppUser save(@RequestBody AppUser user){
        return iUserService.save(user);
    }

    @PutMapping
    public AppUser edit(@RequestBody AppUser user){
        return iUserService.save(user);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        iUserService.delete(id);
        return "ok";
    }
}
