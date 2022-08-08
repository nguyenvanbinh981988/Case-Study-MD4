package com.example.md4_case_study.service;

import com.example.md4_case_study.model.ListUserSelect;

import java.util.List;

public interface IListUserSelectService {

   void save(ListUserSelect listUserSelect);

   List<ListUserSelect> listUserSelectByIdAndBySelect(int idUser, String time);

   void updateStatusConfirm(int idUser,String time);

}
