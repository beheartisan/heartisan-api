package com.heartisan.domain.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heartisan.domain.user.entity.RegistrationBean;
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

	public User createUser(RegistrationBean regisrationBean) {
		User user = new User();
		user.setUsername(regisrationBean.getUsername());
		user.setFirstName(regisrationBean.getFirstName());
		user.setLastName(regisrationBean.getLastName());
		user.setMobileNumber(regisrationBean.getMobileNumber());
		user.setPassword(regisrationBean.getPassword());
		user.setCreatedBy("admin");
		user.setLastModifiedBy("admin");
		User savedUser = userRepository.save(user);
		return savedUser;
	}
}
