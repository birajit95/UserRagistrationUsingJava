package com.user_ragistration;


public class User {
	
	UserValidation userValidate;
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	private String password;
	
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
	
	public void setMobileNumber() {
		this.mobileNumber = userValidate.userInputValidation("Mobile Number");	
	}
	public String getMobileNumber() {
		return this.mobileNumber;
	}
	
	public void setPassword() {
		this.password = userValidate.userInputValidation("Password");	
	}
	public String getPassword() {
		return this.password;
	}

}
