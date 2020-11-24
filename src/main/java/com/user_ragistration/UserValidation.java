package com.user_ragistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {
	Scanner inputScanner = new Scanner(System.in);
	
	static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	
	public String getPattern(String inputTitle) {
		if(inputTitle.equals("First Name") || inputTitle.equals("Last Name")) {
			return NAME_PATTERN;
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
                
                else{
                  System.out.println("Opps! " + inputTitle + " should start with Capital letter and"+
                   " should contain min 3 char!");
                }
          }
          return userInput;
   }
}
