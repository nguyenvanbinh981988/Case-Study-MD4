package com.example.md4_case_study.service;

import com.example.md4_case_study.model.HotelSv;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IHotelSvService {
    Page<HotelSv> getAll(Pageable pageable);
    HotelSv save(HotelSv hotelSv);

    void delete(Long iHotelSv);

    public HotelSv findByIdHotelSv(Long idHotelSv);
}