package com.user_ragistration;

public class UserRegistration 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to User Registration " );
        
        User user = new User();
        user.setFirstName();
        System.out.println(user.getFirstName());
        user.setLastName();
        System.out.println(user.getLastName());
    }
}
