package com.heartisan.domain.home.service;

import com.heartisan.infra.config.ServiceProperties;

import lombok.AllArgsConstructor;
import lombok.NonNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor_={@Autowired})
public class HeartisanService {

    @NonNull private ServiceProperties serviceProperties;

    public String sayHello() {

        return serviceProperties.getMessage();
    }
}
