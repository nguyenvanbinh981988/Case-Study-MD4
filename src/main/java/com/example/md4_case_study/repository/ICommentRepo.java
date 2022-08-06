package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.Comment;
import com.example.md4_case_study.model.Room;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ICommentRepo extends CrudRepository<Comment,Long> {
    @Query(nativeQuery = true,value = "SELECT * FROM md4_case_study.comment where room_id_room =:id")
    List<Comment> findAllByIdRoom(@Param("id")long id);

    List<Comment> findAllByRoom(Room room);
//    public int countCommentByIdR(long idCommnet);
    @Query(nativeQuery = true,value = "select count(id_comment) from comment where room_id_room = :id ")
    int countCommentByRoom(@Param("id") long id);
    @Query(nativeQuery = true,value = "INSERT INTO comment ( content, app_user_id_user, room_id_room) VALUES (:content,:app_user_id_user,:room_id_room)")
    void saveComment(@Param("app_user_id_user") long idUser,@Param("content") String content,@Param("room_id_room")long idRoom);
}


