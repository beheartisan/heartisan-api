package com.heartisan.web.registration;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.heartisan.domain.user.entity.RegistrationBean;
import com.heartisan.domain.user.entity.User;
import com.heartisan.domain.user.service.UserService;

import lombok.NonNull;

@RequestMapping("/registration")
public class RegistrationController {

	@NonNull
	private UserService userService;

	private static final Logger LOG = LoggerFactory.getLogger(RegistrationController.class);

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody @Valid RegistrationBean userBean) {
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(userBean));
	}
}
