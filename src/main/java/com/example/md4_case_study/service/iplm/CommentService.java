package com.example.md4_case_study.service.iplm;

import com.example.md4_case_study.model.Comment;
import com.example.md4_case_study.model.Room;
import com.example.md4_case_study.repository.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    ICommentRepo iCommentRepo;

    public List<Comment> findByIdRoom(long id){
        List<Comment> list = iCommentRepo.findAllByRoomIdRoom(id);
        return list;
    }


    public Comment save(@RequestBody Comment comment){
        return iCommentRepo.save(comment);
    }

    public String delete(@PathVariable long id){
        iCommentRepo.deleteById(id);
        return "da xoa";
    }

    public void saveComment(long idUser,String content,long idroom){


        iCommentRepo.saveComment(idUser,content,idroom);
    }
    public int countComment(long id){
        return iCommentRepo.countCommentByRoom(id);
    }
}
