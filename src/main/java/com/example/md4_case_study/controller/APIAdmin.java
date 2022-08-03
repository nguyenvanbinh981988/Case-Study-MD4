package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.AppUser;
import com.example.md4_case_study.service.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin")
public class APIAdmin {
@Autowired
    IAppUserService appUserService;
@GetMapping
    public List<AppUser> getAll(){
    return appUserService.getAll();
}
    @GetMapping("/{id}")
    public Optional<AppUser> findAppUserById(@PathVariable long id){
        return appUserService.findAppUserById(id);
    }
    @GetMapping("/search")
    public List<AppUser> findByEmail(@RequestParam(defaultValue = "") String email){
        return appUserService.findByEmail(email);
    }
    @PutMapping
    public void edit(@RequestBody AppUser appUser){
        appUserService.save(appUser);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        appUserService.delete(id);
    }
}
