package com.example.md4_case_study.service.iplm;

import com.example.md4_case_study.model.Picture;
import com.example.md4_case_study.repository.PictureRepo;
import com.example.md4_case_study.service.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PictureService implements IPictureService {
    @Autowired
    PictureRepo pictureRepo;

    @Override
    public Page<Picture> getAll(Pageable pageable){
        return pictureRepo.findAll(pageable);
    }


    @Override
    public Picture save(Picture picture){
        return pictureRepo.save(picture);
    }

    @Override
    public void delete(long idPicture){
        pictureRepo.deleteById(idPicture);
    }
}
