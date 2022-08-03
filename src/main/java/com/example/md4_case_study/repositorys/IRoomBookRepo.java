package com.example.md4_case_study.repositorys;

import com.example.md4_case_study.model.RoomBook;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IRoomBookRepo extends PagingAndSortingRepository<RoomBook,Long> {
}
