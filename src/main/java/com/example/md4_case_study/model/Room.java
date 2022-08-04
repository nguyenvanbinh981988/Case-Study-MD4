package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRoom;
    private int roomType;
    private String roomKind;
    private String view;
    private boolean statusRoom;
    private double priceRoom;
//    private String picture1;
//    private String picture2;
//    private String picture3;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Picture> pictures;
}
