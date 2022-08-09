package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class QuantityNotificationUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private AppUser appUser;

    private int quantityNotification = 0;

    public QuantityNotificationUser(AppUser appUser) {
        this.appUser = appUser;
    }
}
