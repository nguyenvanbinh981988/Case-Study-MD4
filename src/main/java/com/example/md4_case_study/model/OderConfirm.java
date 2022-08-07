package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class OderConfirm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private AppUser appUser;

    private int quantityOder ;

    private double totalMoneyOder;

    private LocalDateTime timeOder;

    private boolean statusConfirm = false;

    public OderConfirm(AppUser appUser, int quantityOder, double totalMoneyOder, LocalDateTime timeOder) {
        this.appUser = appUser;
        this.quantityOder = quantityOder;
        this.totalMoneyOder = totalMoneyOder;
        this.timeOder = timeOder;
    }

    public OderConfirm() {

    }
}
