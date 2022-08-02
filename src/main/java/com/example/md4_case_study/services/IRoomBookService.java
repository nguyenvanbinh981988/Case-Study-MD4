package com.example.md4_case_study.services;


import com.example.md4_case_study.model.RoomBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface IRoomBookService {
    Page<RoomBook> getAll(Pageable pageable);
    RoomBook save(RoomBook roomBook);
    void delete(long id);
    RoomBook findById(long id);

}
