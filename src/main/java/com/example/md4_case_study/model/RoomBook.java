package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class RoomBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_roomBook;

    @ManyToOne
    private User user;

    @ManyToOne
    private Room room;

    private String guest_Name;
    private String guest_Cccd;
    private String bankAccount;
    private Date checkIn;
    private Date checkOut;
    private long price;
}
