package com.example.md4_case_study.service;

import com.example.md4_case_study.model.Comment;
import com.example.md4_case_study.repository.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICommentService {
    @Autowired
    ICommentRepo iCommentRepo;

    public List<Comment> getAllByRoom(Long id){
        return iCommentRepo.findAllByIdRoom(id);
    }

}
