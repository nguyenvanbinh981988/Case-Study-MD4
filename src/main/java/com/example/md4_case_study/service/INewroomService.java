package com.example.md4_case_study.service;



import com.example.md4_case_study.model.NewRoom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface INewroomService {
    Page<NewRoom> getAll(Pageable pageable);
    NewRoom save(NewRoom newRoom);
    void delete(long idRoom);
    NewRoom findById(long idRoom);
    List<NewRoom> findByName(String nameRoom);
}
