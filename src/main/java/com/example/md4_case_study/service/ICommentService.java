package com.example.md4_case_study.service;

import com.example.md4_case_study.model.Comment;
import com.example.md4_case_study.repository.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ICommentService {
    @Autowired
    ICommentRepo iCommentRepo;

    public List<Comment> getAllByRoom(Long id){
        return iCommentRepo.findAllByIdRoom(id);
    }

    public Comment save(@RequestBody Comment comment){
        return iCommentRepo.save(comment);
    }

    public String delete(@PathVariable long id){
        iCommentRepo.deleteById(id);
        return "da xoa";
    }

    public int countComment(long id){
        return iCommentRepo.countCommentByIdComment(id);
    }
}
