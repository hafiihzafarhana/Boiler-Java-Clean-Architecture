package com.project.cleanarchi.core.presentation.controllers.v1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("dummies")
public class DummyController {
    @GetMapping("/")
    public String getDummies() {
        return new String();
    }
    
}
