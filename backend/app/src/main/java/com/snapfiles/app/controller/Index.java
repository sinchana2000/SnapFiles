package com.snapfiles.app.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class Index {
    @GetMapping("/index")
    String sample(){
        return "HELLO QT!";
    }
}
