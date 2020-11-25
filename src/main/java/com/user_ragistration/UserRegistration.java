package com.user_ragistration;

public class UserRegistration 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to User Registration " );
        
        User user = new User();
//        user.setFirstName();
//        System.out.println(user.getFirstName());
//        user.setLastName();
//        System.out.println(user.getLastName());
//        user.setEmail();
//        System.out.println(user.getEmail());
//        user.setMobileNumber();
//        System.out.println(user.getMobileNumber());
//        
//        user.setPassword();
//        System.out.println(user.getPassword());
        
        UserValidation userVal = new UserValidation();
        userVal.checkAllEmails();
    }
}
