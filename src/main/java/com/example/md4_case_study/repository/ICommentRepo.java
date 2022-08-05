package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICommentRepo extends CrudRepository<Comment,Long> {
    @Query(nativeQuery = true,value = "SELECT * FROM md4_case_study.comment where room_id_room =:id")
    List<Comment> findAllByIdRoom(@Param("id")long id);

//    public int countCommentByIdR(long idCommnet);
    public int countCommentByRoom(long id);
}
