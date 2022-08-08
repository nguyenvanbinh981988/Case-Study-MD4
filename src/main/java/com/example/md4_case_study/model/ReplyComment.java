package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class ReplyComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReplyComment;
    private String replyContent;
    private LocalDateTime dateReplyComment ;
    @ManyToOne
    private Comment comment;
}
