package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalTime;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idComment;
    private String content;
    private LocalTime dateComment ;
    @ManyToOne
    private Room room;
    @ManyToOne
    private AppUser appUser;
}
