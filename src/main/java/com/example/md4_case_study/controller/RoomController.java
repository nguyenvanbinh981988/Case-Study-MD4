package com.example.md4_case_study.controller;

import com.example.md4_case_study.model.Room;
import com.example.md4_case_study.service.iplm.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping ("/user")
public class RoomController {
    @Autowired
    RoomService roomService;
    @GetMapping
    public ResponseEntity<Iterable<Room>> findAllRoom() {
        List<Room> rooms = (List<Room>) roomService.findAll();
        if (rooms.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Room> findRoomById(@PathVariable long id) {
        Optional<Room> roomOptional = roomService.findById(id);
        if (!roomOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(roomOptional.get(),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Room> update( @PathVariable long id,@RequestBody Room room) {
        Optional<Room> roomOptional = roomService.findById(id);
        if(!roomOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        room.setIdRoom(roomOptional.get().getIdRoom());
        roomService.save(room);
        return new ResponseEntity<>(room, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Room> deleteRoom(@PathVariable long id) {
        Optional<Room> roomOptional = roomService.findById(id);
        if (!roomOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        roomService.remove(id);
        return new ResponseEntity<>(roomOptional.get(), HttpStatus.NO_CONTENT);
    }
    @PostMapping("/upImg")
    public String upImg(@RequestParam MultipartFile file){
        String name = file.getOriginalFilename();
        try {
            FileCopyUtils.copy(file.getBytes(),new File("C:\\Case-Study-MD4-FE\\royal-master\\image\\" + name));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "/image/"+name;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

    @PostMapping("/showroomdetail/{id}")
    public Room showChiTiet(@PathVariable long id){
        Room room=roomService.findById(id).get();
        return room;
    }

}