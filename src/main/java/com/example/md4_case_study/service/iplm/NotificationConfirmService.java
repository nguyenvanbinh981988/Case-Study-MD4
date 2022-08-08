package com.example.md4_case_study.service.iplm;

import com.example.md4_case_study.model.NotificationConfirm;
import com.example.md4_case_study.repository.NotificationConfirmRepo;
import com.example.md4_case_study.service.INotificationConfirmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationConfirmService implements INotificationConfirmService {
    @Autowired
    NotificationConfirmRepo notificationConfirmRepo;
    @Override
    public void saveNotificationConfirm(NotificationConfirm notificationConfirm) {
        notificationConfirmRepo.save(notificationConfirm);
    }

    @Override
    public List<NotificationConfirm> notificationConfirmByIdUser(int idUser) {
        return (List<NotificationConfirm>) notificationConfirmRepo.notificationConfirmsByIdUser(idUser);
    }

}
