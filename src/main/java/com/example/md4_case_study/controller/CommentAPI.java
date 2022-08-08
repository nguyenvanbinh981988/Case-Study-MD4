package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.Comment;
import com.example.md4_case_study.model.CommentUser;
import com.example.md4_case_study.service.CommentService;

import com.example.md4_case_study.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/comment")
public class CommentAPI {
    @Autowired
    CommentService commentService;

    @Autowired
    RoomService roomService;
    @GetMapping("/{id}")
    public List<Comment>getAll(@PathVariable long id){
        return commentService.findByIdRoom(id);
    }

    @PostMapping
    public String create(@RequestBody Comment comment){
        LocalDateTime localDateTime = LocalDateTime.now();
        comment.setDateComment(localDateTime);
        commentService.save(comment);
        return"okiiiii";
    }

    @PutMapping
    public Comment edit(@RequestBody Comment comment){
        return commentService.save(comment);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id){
        commentService.delete(id);
        return "ok";
    }

    @GetMapping("/countComment/{id}")
    public int countComment( @PathVariable("id") int id){
        return commentService.countComment(id);
    }
}
