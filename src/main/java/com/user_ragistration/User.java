package com.user_ragistration;


public class User {
	
	UserValidation userValidate;
	private String firstName;
	
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
		this.firstName = userValidate.userInputValidation("First Name");	
	}
	public String getLastName() {
		return this.firstName;
	}

}
