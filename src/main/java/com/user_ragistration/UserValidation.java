package com.user_ragistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {
	Scanner inputScanner = new Scanner(System.in);
	
	static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	static final String EMAIL_PATTERN = "^[a-zA-Z]{1}[a-zA-Z0-9]+([-\\.\\_\\+]?[0-9a-zA-Z]+)*\\@[a-zA-Z]+([\\.][a-z]{2,4})?([\\.][a-z]{2,4})$";
	static final String MOBILE_NUMBER_PATTERN = "^(\\+91|91)[ ]{1}[6-9]{1}[0-9]{9}$";
	
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
                else{
                  System.out.println("\nOpps! " + inputTitle + " should start with Capital letter and"+
                   " should contain min 3 char!\n");
                }
          }
          return userInput;
   }
}
