package com.example.md4_case_study.repository;

import com.example.md4_case_study.model.ReplyComment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IReplyCommentRepo extends CrudRepository<ReplyComment,Long> {
//    List<ReplyComment> findAllByComment(long id);
    @Query(nativeQuery = true,value = "select * from reply_comment where comment_id_comment :=id")
    public List<ReplyComment> findAllByComment(@Param("id") long id);

}
