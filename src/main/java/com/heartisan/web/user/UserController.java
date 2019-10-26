package com.heartisan.web.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.heartisan.domain.user.entity.User;
import com.heartisan.domain.user.exception.UserNotFoundException;
import com.heartisan.domain.user.service.UserService;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@Controller
@RequestMapping("/users")
@AllArgsConstructor(onConstructor_= {@Autowired})
public class UserController {

	@NonNull private UserService userService;
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> getAllUsers() {
		return ResponseEntity.ok(userService.getAllUsers());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getUserById(@PathVariable(name = "id") Long userId) {
		try {
			return ResponseEntity.ok(userService.getUserById(userId));
		} catch (UserNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
}