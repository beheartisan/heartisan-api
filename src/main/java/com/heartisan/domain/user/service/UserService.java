package com.heartisan.domain.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heartisan.domain.user.entity.User;
import com.heartisan.domain.user.exception.UserNotFoundException;
import com.heartisan.domain.user.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@Service
@AllArgsConstructor(onConstructor_= {@Autowired})
public class UserService {
	
	@NonNull private UserRepository userRepository;
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	public User getUserById(Long userId) throws UserNotFoundException {
		return userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
	}
}
