package com.example.md4_case_study.service;

import com.example.md4_case_study.model.OderConfirm;

import java.util.List;

public interface IOderConFirm {
    List<OderConfirm> listOderConfirm ();
    void saveOderConfirm(OderConfirm oderConfirm);
}
