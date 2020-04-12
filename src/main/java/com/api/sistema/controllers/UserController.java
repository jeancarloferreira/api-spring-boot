package com.api.sistema.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World";
    }
}
