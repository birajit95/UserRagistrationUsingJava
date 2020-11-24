package com.user_ragistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {
	Scanner inputScanner = new Scanner(System.in);
	
	public String userInputValidation(String pattern , String inputTitle ){
        String userInput;
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
