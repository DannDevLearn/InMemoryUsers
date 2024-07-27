package com.example.architecture.security.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* Here only private endpoints!
* */
@RestController
@RequestMapping("/information")
public class SecondController {

    @GetMapping
    public ResponseEntity<String> info(){
        return ResponseEntity.ok("Aquí está la información personal que debe ser privada");
    }

    @PostMapping
    public ResponseEntity<String> moreInfo(){
        return ResponseEntity.ok("Método post pero esto debe estar protegido");
    }

}
