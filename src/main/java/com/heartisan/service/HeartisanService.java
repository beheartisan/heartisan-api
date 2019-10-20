package com.heartisan.service;

import com.heartisan.config.ServiceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeartisanService {

    @Autowired
    ServiceProperties serviceProperties;


    public String sayHello() {

        return serviceProperties.getMessage();
    }
}
