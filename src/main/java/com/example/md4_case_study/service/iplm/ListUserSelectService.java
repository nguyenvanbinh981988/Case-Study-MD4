package com.example.md4_case_study.service.iplm;

import com.example.md4_case_study.model.ListUserSelect;
import com.example.md4_case_study.repository.ListUserSelectRepo;
import com.example.md4_case_study.service.IListUserSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListUserSelectService implements IListUserSelectService {
    @Autowired
    ListUserSelectRepo listUserSelectRepo;

    @Override
    public void save(ListUserSelect listUserSelect) {
        listUserSelectRepo.save(listUserSelect);
    }

    @Override
    public List<ListUserSelect> listUserSelectByIdAndBySelect(int idUser, String time) {
       return  listUserSelectRepo.listUserSelectByIdAndBySelect(idUser,time);
    }

}
