package com.example.md4_case_study.service;


import com.example.md4_case_study.model.ListUserSelect;
import com.example.md4_case_study.model.NotificationAdmin;

import java.util.List;

public interface INotificationAdminService {
       void saveNotificationAdmin(NotificationAdmin notificationAdmin);
       List<NotificationAdmin> listNotificationAdmin();
       void updateStatusConfirmAdmin(int idUser,String time);
}
