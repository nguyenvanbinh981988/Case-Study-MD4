package com.example.md4_case_study.model;

import java.time.LocalDateTime;

public class CommentUser {
    private long idUser;
    private String content;
    private LocalDateTime dateComment;
    private long idroom;

    public CommentUser(long idUser, String content, LocalDateTime dateComment, long idroom) {
        this.idUser = idUser;
        this.content = content;
        this.dateComment = dateComment;
        this.idroom = idroom;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDateComment() {
        return dateComment;
    }

    public void setDateComment(LocalDateTime dateComment) {
        this.dateComment = dateComment;
    }

    public long getIdroom() {
        return idroom;
    }

    public void setIdroom(long idroom) {
        this.idroom = idroom;
    }

}
