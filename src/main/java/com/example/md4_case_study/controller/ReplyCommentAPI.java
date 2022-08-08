package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.ReplyComment;
import com.example.md4_case_study.service.iplm.CommentService;
import com.example.md4_case_study.service.iplm.IReplyCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/replyComment")
public class ReplyCommentAPI {
    @Autowired
    IReplyCommentService iReplyCommentService;

    @Autowired
    CommentService commentService;

    @GetMapping("/{id}")
    public List<ReplyComment> getAll(@PathVariable("id") long id){
        return iReplyCommentService.findALlByComment(id);
    }
//    @GetMapping("/{id}")
//    public List<ReplyComment> getAll(@PathVariable lo)
}
