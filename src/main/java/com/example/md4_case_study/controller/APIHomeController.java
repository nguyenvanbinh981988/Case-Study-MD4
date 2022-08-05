package com.example.md4_case_study.controller;
import com.example.md4_case_study.model.AppUser;


import com.example.md4_case_study.service.iplm.JwtService;


import com.example.md4_case_study.model.UserLoging;
import com.example.md4_case_study.service.IAppUserService;
import com.example.md4_case_study.service.iplm.AppUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class APIHomeController {


    @Autowired
    JwtService jwtService;

    @Autowired
    AppUserService userService;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/login")

    public UserLoging login(@RequestBody AppUser appUser){
        try {
            // Tạo ra 1 đối tượng Authentication.
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(appUser.getNameUser(), appUser.getPasswordUser()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
            String token = jwtService.createToken(authentication);
            return new UserLoging(userService.findAppUserByName(appUser.getNameUser()).getIdUser(),token);
        } catch (Exception e) {
            return null;
        }
    }


    @PostMapping("/register")

    public String register(@RequestBody AppUser appUser) {
//        String pass = passwordEncoder.encode(appUser.getPasswordUser());
//        appUser.setPasswordUser(pass);
        userService.save(appUser);
        userService.saveRole(appUser.getIdUser());
        return "okkkkkk";

    }
}