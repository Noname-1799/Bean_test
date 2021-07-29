package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.ClassicMusic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/controller")
public class MainController {

    ClassicMusic classicMusic;

    @GetMapping(value = "one")
    public Integer mainAndPoint(ClassicMusic classicMusic){
    return classicMusic.getId();
    }
}
