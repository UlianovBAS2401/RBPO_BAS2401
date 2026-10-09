package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {

    @GetMapping("/text")
    public String getText() {
        return "Ульянов Алексей Сергеевич";
    }

}
