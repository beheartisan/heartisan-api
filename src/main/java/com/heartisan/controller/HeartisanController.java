package com.heartisan.controller;

import com.heartisan.service.HeartisanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/v1/heartisan")
public class HeartisanController {

    @Autowired
    HeartisanService heartisanServic;

    @GetMapping(value = "/sayHello")
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>(heartisanServic.sayHello(), HttpStatus.OK);

    }
}
