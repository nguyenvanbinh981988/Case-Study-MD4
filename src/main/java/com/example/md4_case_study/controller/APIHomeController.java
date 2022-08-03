package com.example.md4_case_study.controller;
import com.example.md4_case_study.model.AppUser;
import com.example.md4_case_study.service.IAppUserService;
import com.example.md4_case_study.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class APIHomeController {
    @Autowired
    JwtService jwtService;

    @Autowired
    IAppUserService userService;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public String login(@RequestBody AppUser appUser){
        try {
            // Tạo ra 1 đối tượng Authentication.
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(appUser.getNameUser(), appUser.getPasswordUser()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
            String token = jwtService.createToken(authentication);
            return token;
        } catch (Exception e) {
            return e.getMessage();
        }
    }


    @PostMapping("/register")
    public void register(@RequestBody AppUser appUser) {
//        String pass = passwordEncoder.encode(appUser.getPasswordUser());
//        appUser.setPasswordUser(pass);
        userService.save(appUser);
        userService.saveRole(appUser.getIdUser());
    }
}
