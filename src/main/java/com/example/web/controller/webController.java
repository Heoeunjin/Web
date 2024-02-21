package com.example.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class webController {
        @GetMapping("/web")
        public String demo(){
            return "Demo Page";
        }
    }
