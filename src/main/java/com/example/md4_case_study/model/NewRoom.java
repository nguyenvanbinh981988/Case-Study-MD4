package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
@Entity
@Data
public class NewRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRoom;
    private String nameRoom;
    private int roomType;
    private String roomKind;
    private String view;
    private boolean statusRoom;
    private double priceRoom;
    private String imgRoom;
}
