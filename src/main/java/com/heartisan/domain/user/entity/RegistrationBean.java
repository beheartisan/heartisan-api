package com.heartisan.domain.user.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationBean {

	@NotNull
	@NotEmpty
	@Email
	private String username;
	
	@NotNull
	@NotEmpty
	@Pattern(regexp = "[\\s]*[0-9]*[1-9]+",message="Enter a valid mobile number")
	private String mobileNumber;	
	
	@NotNull
	@NotEmpty
	private String firstName;
	
	@NotNull
	@NotEmpty
	private String lastName;
	
	@NotNull
	@NotEmpty
	private String password;
	
}
