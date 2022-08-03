package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idComment;
    private String content;
    private Date date;
    @ManyToOne
    private Room room;
    @ManyToOne
    private AppUser appUser;
}
