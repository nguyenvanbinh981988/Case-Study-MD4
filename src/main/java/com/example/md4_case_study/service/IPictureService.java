package com.example.md4_case_study.service;

import com.example.md4_case_study.model.Picture;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface IPictureService {
    Page<Picture> getAll(Pageable pageable);

    Picture save(Picture picture);


    void delete(long idPicture);
}
