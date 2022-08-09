package com.example.md4_case_study.service.iplm;

import com.example.md4_case_study.model.ListUserSelect;
import com.example.md4_case_study.model.NotificationAdmin;
import com.example.md4_case_study.repository.NotificationAdminRepo;
import com.example.md4_case_study.service.INotificationAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NotificationAdminService implements INotificationAdminService {
    @Autowired
    NotificationAdminRepo notificationAdminRepo;
    @Override
    public void saveNotificationAdmin(NotificationAdmin notificationAdmin) {
        notificationAdminRepo.save(notificationAdmin);
    }

    @Override
    public List<NotificationAdmin> listNotificationAdmin() {
        return (List<NotificationAdmin>) notificationAdminRepo.findAll();
    }

    @Override
    public void updateStatusConfirmAdmin(int idUser, String time) {
        notificationAdminRepo.updateStatusConfirmAdmin(idUser,time);
    }
}
