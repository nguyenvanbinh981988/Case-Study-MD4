package com.example.md4_case_study.service;

import com.example.md4_case_study.model.ReplyComment;
import com.example.md4_case_study.repository.IReplyCommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IReplyCommentService {
    @Autowired
    IReplyCommentRepo iReplyCommentRepo;

    public List<ReplyComment> findALlByComment(long id){
        return iReplyCommentRepo.findAllByComment(id);
    }

//    public List<ReplyComment> findALlByComment(long id){
//        return iReplyCommentRepo.findAllByComment(id);
//    }
}
