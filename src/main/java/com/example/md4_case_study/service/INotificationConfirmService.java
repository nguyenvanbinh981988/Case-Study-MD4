package com.example.md4_case_study.service;

import com.example.md4_case_study.model.NotificationConfirm;

import java.util.List;

public interface INotificationConfirmService {


    void saveNotificationConfirm(NotificationConfirm notificationConfirm);

    List<NotificationConfirm> notificationConfirmByIdUser(int idUser);
}
