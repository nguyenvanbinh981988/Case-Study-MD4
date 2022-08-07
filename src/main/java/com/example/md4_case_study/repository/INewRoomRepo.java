package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.NewRoom;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INewRoomRepo extends PagingAndSortingRepository<NewRoom,Long> {
//    @Query(nativeQuery = true, value = "SELECT * FROM product_c0322g1.product where name like concat('%',:name,'%');")
    List<NewRoom> findAllByNameRoomContaining(String nameRoom);
}
