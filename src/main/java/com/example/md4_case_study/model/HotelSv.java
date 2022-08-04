package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class HotelSv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdHotelSv;
    private long nameHotelSv;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Picture> pictures;
}
