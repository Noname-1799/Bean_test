package org.example.controllers;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.ClassicMusic;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/controller")
public class MainController {

    private final static Logger logger = LoggerFactory.getLogger(MainController.class);

    ClassicMusic classicMusic;
    UserRepository userRepository;

    @Autowired
    public MainController(ClassicMusic classicMusic, UserRepository userRepository){
        this.classicMusic = classicMusic;
        this.userRepository = userRepository;
    }

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
