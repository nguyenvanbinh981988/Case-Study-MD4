package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.HotelSv;
import com.example.md4_case_study.model.Room;
import com.example.md4_case_study.service.iplm.HotelSvService;
import com.example.md4_case_study.service.iplm.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotelSv")
@CrossOrigin("*")

public class APIHotelSvController {
    @Autowired
    HotelSvService hotelSvService;

    @GetMapping
    public Page<HotelSv> getPage(){
        return hotelSvService.getAll(PageRequest.of(0,6));
    }

    @PostMapping
    public HotelSv save(@RequestBody HotelSv hotelSv){
        hotelSvService.save(hotelSv);
        return hotelSv;
    }

    @PutMapping
    public HotelSv update(@RequestBody HotelSv hotelSv){
        hotelSvService.save(hotelSv);
        return hotelSv;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long idHotelSv){
        hotelSvService.delete(idHotelSv);
        return "OK";
    }

}
