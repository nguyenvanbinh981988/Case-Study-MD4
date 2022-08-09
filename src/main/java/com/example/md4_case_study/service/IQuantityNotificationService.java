package com.example.md4_case_study.service;

import com.example.md4_case_study.model.QuantityNotificationUser;

public interface IQuantityNotificationService {
     void updateStatusConfirm(int idUser,int quantity);

    int countQuantityNotificationUser(int idUser);

    void saveQuantityNotificationUser(QuantityNotificationUser quantityNotificationUser);
    void updateStatusConfirmTo0(int idUser);

    void updateStatusConfirmAdmin(int quantity);

    void updateStatusConfirmTo0Admin();
}
