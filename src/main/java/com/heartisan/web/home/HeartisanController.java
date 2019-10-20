package com.heartisan.web.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heartisan.domain.home.service.HeartisanService;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@RestController(value = "/v1/heartisan")
@AllArgsConstructor(onConstructor_={@Autowired})
public class HeartisanController {

    @NonNull private HeartisanService heartisanServic;

    @GetMapping(value = "/sayHello")
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>(heartisanServic.sayHello(), HttpStatus.OK);

    }
}
