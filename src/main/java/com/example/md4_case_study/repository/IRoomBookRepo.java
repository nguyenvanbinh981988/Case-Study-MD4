package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.AppUser;
import com.example.md4_case_study.model.RoomBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;


public interface IRoomBookRepo extends PagingAndSortingRepository<RoomBook,Long> {
    Optional<RoomBook> findByAppUser(AppUser appUser);
    Page<RoomBook> findByNameGuestContaining(Pageable pageable, String nameGuest);
    Page<RoomBook> findByNameGuest(String nameGuest);



}
