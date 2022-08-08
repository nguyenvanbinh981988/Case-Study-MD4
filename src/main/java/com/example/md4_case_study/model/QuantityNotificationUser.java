package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Data
@Entity
public class QuantityNotificationUser {
    @Id
    private int id;
    @OneToOne
    private AppUser appUser;

    private int quantityNotification = 0;
}
