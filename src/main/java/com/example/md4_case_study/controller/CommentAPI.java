package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.Comment;
import com.example.md4_case_study.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/comment")
public class CommentAPI {
    @Autowired
    ICommentService iCommentService;
    @GetMapping("/{id}")
    public List<Comment>getAll(@PathVariable long id){
        List<Comment> list =iCommentService.getAllByRoom(id);
        return list;
    }

    @PostMapping
    public Comment create(@RequestBody Comment comment){
        return iCommentService.save(comment);
    }

    @PutMapping
    public Comment edit(@RequestBody Comment comment){
        return iCommentService.save(comment);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id){
        iCommentService.delete(id);
        return "ok";
    }

    @GetMapping("/countComment")
    public int countComment(int id){
        return iCommentService.countComment(id);
    }
}
