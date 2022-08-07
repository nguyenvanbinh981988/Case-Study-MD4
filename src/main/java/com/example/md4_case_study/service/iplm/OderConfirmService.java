package com.example.md4_case_study.service.iplm;

import com.example.md4_case_study.model.OderConfirm;
import com.example.md4_case_study.repository.OderConfirmRepo;
import com.example.md4_case_study.service.IOderConFirm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OderConfirmService implements IOderConFirm {

    @Autowired
    OderConfirmRepo oderConfirmRepo;

    @Override
    public List<OderConfirm> listOderConfirm() {
        return (List<OderConfirm>) oderConfirmRepo.findAll();
    }

    @Override
    public void saveOderConfirm(OderConfirm oderConfirm) {
        oderConfirmRepo.save(oderConfirm);
    }
}
