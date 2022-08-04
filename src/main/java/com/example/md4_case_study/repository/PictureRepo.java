package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.Picture;
import com.example.md4_case_study.model.RoomBook;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PictureRepo extends PagingAndSortingRepository<Picture,Long> {

}
