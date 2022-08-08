package com.example.md4_case_study.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class HotelSv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idHotelSv;
    private String nameHotelSv;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Picture> pictures;
}
