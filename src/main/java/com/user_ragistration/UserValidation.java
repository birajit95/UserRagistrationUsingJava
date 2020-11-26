package com.user_ragistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {
	Scanner inputScanner = new Scanner(System.in);
	
	static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	static final String EMAIL_PATTERN = "^[a-zA-Z]{1}[a-zA-Z0-9]+([-\\.\\_\\+]?[0-9a-zA-Z]+)*\\@[a-zA-Z]+([\\.][a-z]{2,4})?([\\.][a-z]{2,4})$";
	static final String MOBILE_NUMBER_PATTERN = "^(\\+91|91)[ ]{1}[6-9]{1}[0-9]{9}$";
	static final String PASSWORD_PATTERN = "(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9])([a-zA-Z0-9]|[^a-zA-Z0-9]){8,}";
	
	public String getPattern(String inputTitle) {
		if(inputTitle.equals("First Name") || inputTitle.equals("Last Name")) {
			return NAME_PATTERN;
		}
		else if(inputTitle.equals("Email")) {
			return EMAIL_PATTERN;
		}
		else if(inputTitle.equals("Mobile Number")) {
			return MOBILE_NUMBER_PATTERN;
		}
		else if(inputTitle.equals("Password")) {
			return PASSWORD_PATTERN;
		}
		return null;
	}
	
	public String userInputValidation(String inputTitle ){
        String userInput;
        String pattern = getPattern(inputTitle);
        while(true){
                System.out.print("Enter "+inputTitle+": ");
                userInput = inputScanner.nextLine();
                if(Pattern.matches(pattern,String.valueOf(userInput))){
                  break;
                 }
                else if(inputTitle.equals("Email") || inputTitle.equals("Mobile Number")) {
                	System.out.println("\nInvalid " + inputTitle +"! Try with diffrent one.\n");
                }
                else if(inputTitle.equals("Password")) {
                	System.out.println("\nInvalid " + inputTitle +" format ! Password must contain 8 char.\n");
                }
                else{
                  System.out.println("\nOpps! " + inputTitle + " should start with Capital letter and"+
                   " should contain min 3 char!\n");
                }
          }
          return userInput;
   }
	
  
   
	public void validateEmail(String [] emailList) {
		for(String email : emailList) {
			if(Pattern.matches(EMAIL_PATTERN,email)){
                System.out.println(email +"-> pass");
               }
			else {
				System.out.println(email +"-> fail ");
			}
		}
	}
	public void checkAllEmails() {
		String invalidEmailList[] = {"abc","abc@.com.my","abc123@gmail.a","abc123@.com", 
				"abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
                 "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", 
                 "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

		String validEmailList[] = {"abc@yahoo.com", "abc-100@yahoo.com",
              "abc.100@yahoo.com", "abc111@abc.com",
                "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
		
		System.out.println("\nChecking all valid emails..\n");
		validateEmail(validEmailList);
		System.out.println("\nChecking all Invalid emails..\n");
		validateEmail(invalidEmailList);	
		
	}
	
	 public boolean isValid(String inputTitle, String userInput, UserInputInvalidException.ExceptionType exceptionType ) 
			 throws UserInputInvalidException {
		 
	    	String inputPattern = getPattern(inputTitle);
	    	if(Pattern.matches(inputPattern,String.valueOf(userInput))){
                return true;
            }
	    	else {
	    		throw new UserInputInvalidException(exceptionType,"Invalid "+inputTitle);
	    	}
	 	}
	 
	 public boolean isValidFirstName(String userInput) throws UserInputInvalidException {
		 return isValid("First Name", userInput, UserInputInvalidException.ExceptionType.INVALID_FIRST_NAME);
	 }
	 public boolean isValidLastName(String userInput) throws UserInputInvalidException {
		 return isValid("Last Name", userInput, UserInputInvalidException.ExceptionType.INVALID_LAST_NAME);
	 }
	 public boolean isValidEmail(String userInput) throws UserInputInvalidException {
		 return isValid("Email", userInput, UserInputInvalidException.ExceptionType.INVALID_EMAIL);
	 }
	 public boolean isValidMobileNumber(String userInput) throws UserInputInvalidException {
		 return isValid("Mobile Number", userInput, UserInputInvalidException.ExceptionType.INVALID_MOBILE_NUMBER);
	 }
	 public boolean isValidPassword(String userInput) throws UserInputInvalidException {
		 return isValid("Password", userInput, UserInputInvalidException.ExceptionType.INVALID_PASSWORD);
	 }
	
}










