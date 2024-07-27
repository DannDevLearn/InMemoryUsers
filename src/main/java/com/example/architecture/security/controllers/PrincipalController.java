package com.example.architecture.security.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* Here only public controllers!
* */

@RestController
@RequestMapping("/home")
public class PrincipalController {

    @GetMapping
    public ResponseEntity<String> home(){
        return ResponseEntity.ok("Bienvenido al home de esta página");
    }

    @GetMapping("/about")
    public ResponseEntity<String> about(){
        return ResponseEntity.ok("Estamos en el about de la página");
    }

}
