package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class RoomBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRoomBook;

    @ManyToOne


    private AppUser appUser;


    @ManyToOne
    private Room room;

    private String nameGuest;
    private String cccdGuest;
    private String bankAccount;
    private Date checkIn;
    private Date checkOut;
    private long price;
}
