package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.HotelSv;
import com.example.md4_case_study.model.Room;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HotelSvRepo extends PagingAndSortingRepository<HotelSv,Long> {
    HotelSv findByNameHotelSv(String nameHotelSv);

    HotelSv findByIdHotelSv(Long idHotelSv);
}


