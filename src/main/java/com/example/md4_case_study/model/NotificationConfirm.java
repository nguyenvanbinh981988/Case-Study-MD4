package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class NotificationConfirm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    AppUser appUser;

    private String contentNotification;


    private String timeSelectOfUser;

    private String timeNotification;

}
