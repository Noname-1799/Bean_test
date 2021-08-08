package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.ClassicMusic;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/controller")
public class MainController {

    ClassicMusic classicMusic;
    UserRepository userRepository;

    @GetMapping(value = "one")
    public Integer mainAndPoint(ClassicMusic classicMusic){
    return classicMusic.getId();
    }

    @GetMapping(value = "two")
    public void add(){
        User user = new User();
        user.setName("Marat");
        userRepository.save(user);
    }
}
