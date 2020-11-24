package com.user_ragistration;


public class User {
	
	UserValidation userValidate;
	private String firstName;
	private String lastName;
	private String email;
	
	public User() {
		userValidate = new UserValidation();
	}
	
	public void setFirstName() {
			this.firstName = userValidate.userInputValidation("First Name");	
	}
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName() {
		this.lastName = userValidate.userInputValidation("Last Name");	
	}
	public String getLastName() {
		return this.lastName;
	}
	
	public void setEmail() {
		this.email = userValidate.userInputValidation("Email");	
	}
	public String getEmail() {
		return this.email;
	}

}
