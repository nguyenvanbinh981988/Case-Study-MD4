package com.example.md4_case_study.service.iplm;

import com.example.md4_case_study.model.HotelSv;
import com.example.md4_case_study.model.Room;
import com.example.md4_case_study.repository.HotelSvRepo;
import com.example.md4_case_study.service.IHotelSvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class HotelSvService implements IHotelSvService {
    @Autowired
    HotelSvRepo hotelSvRepo;

    @Override
    public Page<HotelSv> getAll(Pageable pageable) {
        return hotelSvRepo.findAll(pageable);
    }

    public HotelSv findByNameHotelSv(String nameHotelSv) {
        return hotelSvRepo.findByNameHotelSv(nameHotelSv);
    }

    @Override
    public HotelSv save(HotelSv hotelSv) {
        return hotelSvRepo.save(hotelSv);
    }

    @Override
    public void delete(Long idHotelSv) {
        hotelSvRepo.deleteById(idHotelSv);
    }

    @Override
    public HotelSv findByIdHotelSv(Long idHotelSv) {
        return hotelSvRepo.findByIdHotelSv(idHotelSv);
    }
}