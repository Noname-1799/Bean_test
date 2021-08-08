package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.ClassicMusic;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/controller")
public class MainController {

    private final static Logger logger = LoggerFactory.getLogger(MainController.class);

    ClassicMusic classicMusic;
    UserRepository userRepository;

    @GetMapping(value = "one")
    public Integer mainAndPoint(ClassicMusic classicMusic){
    return classicMusic.getId();
    }

    @GetMapping(value = "two")
    public HttpStatus add(){
        User user = new User();
        user.setName("Marat");
        user.setId(5);
        userRepository.save(user);
        logger.info("All records saved.");
        return HttpStatus.OK;
    }
}
