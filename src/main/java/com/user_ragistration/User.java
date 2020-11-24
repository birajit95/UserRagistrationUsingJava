package com.user_ragistration;


public class User {
	
	UserValidation userValidate;
	private String firstName;
	
	public User() {
		userValidate = new UserValidation();
	}
	
	public void setFirstName() {
			final String firstNamePattern = "^[A-Z][a-z]{2,}$";
			this.firstName = userValidate.userInputValidation(firstNamePattern, "First Name");	
	}
	public String getFirstName() {
		return this.firstName;
	}

}
