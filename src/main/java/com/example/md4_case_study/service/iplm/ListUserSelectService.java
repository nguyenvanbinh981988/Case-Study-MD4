package com.example.md4_case_study.service.iplm;

import com.example.md4_case_study.model.ListUserSelect;
import com.example.md4_case_study.repository.ListUserSelectRepo;
import com.example.md4_case_study.service.IListUserSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListUserSelectService implements IListUserSelect {
    @Autowired
    ListUserSelectRepo listUserSelectRepo;

    @Override
    public void save(ListUserSelect listUserSelect) {
        listUserSelectRepo.save(listUserSelect);
    }

//    @Override
//    public int quantitySelect(int id) {
//        return  listUserSelectRepo.quantitySelect(id);
//    }

}
