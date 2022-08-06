package com.example.md4_case_study.service.iplm;

import com.example.md4_case_study.model.Role;
import com.example.md4_case_study.model.Room;
import com.example.md4_case_study.repository.IRoleRepo;
import com.example.md4_case_study.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleService implements IRoleService {
    @Autowired
    IRoleRepo iRoleRepo;
    @Override
    public List<Role> getRole() {
        return  (List<Role>) iRoleRepo.findAll();
    }

    @Override
    public void save(Role roles) {
iRoleRepo.save(roles);
    }
}
