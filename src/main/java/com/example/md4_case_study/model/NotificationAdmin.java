package com.example.md4_case_study.model;

import lombok.Data;
import org.springframework.security.core.parameters.P;

import javax.persistence.*;

@Entity
@Data
public class NotificationAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @ManyToOne
    private AppUser appUser;

    private String timeSelect;

    private boolean statusConfirm=false;

    public NotificationAdmin(AppUser appUser, String timeSelect) {
        this.appUser = appUser;
        this.timeSelect = timeSelect;
    }

    public NotificationAdmin() {

    }
}
