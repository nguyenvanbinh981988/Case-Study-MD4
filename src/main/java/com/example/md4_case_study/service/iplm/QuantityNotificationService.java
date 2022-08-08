package com.example.md4_case_study.service.iplm;

import com.example.md4_case_study.repository.QuantityNotificationRepo;
import com.example.md4_case_study.service.IQuantityNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuantityNotificationService implements IQuantityNotificationService {
    @Autowired
    QuantityNotificationRepo quantityNotificationRepo;
    @Override
    public void updateStatusConfirm(int idUser, int quantity) {
        quantityNotificationRepo.updateStatusConfirm(idUser,quantity);
    }

    @Override
    public int countQuantityNotificationUser(int idUser) {
        return quantityNotificationRepo.countQuantityNotificationUser(idUser);
    }
}
