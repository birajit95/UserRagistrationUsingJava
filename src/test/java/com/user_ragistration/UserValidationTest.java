package com.user_ragistration;

import  org.junit.Assert;

import org.junit.Test;


public class UserValidationTest 
{
	 UserValidation userValidation = new UserValidation();
   
    @Test
    public void ifProperFirstNameThisShouldReturnTrue(){
       
        try {
        	 boolean result = userValidation.isValidFirstName("Birajit");
        	 Assert.assertTrue(result);
          }
        catch(UserInputInvalidException e) {
        	System.out.println(e.getMessage());
        	Assert.assertEquals(UserInputInvalidException.ExceptionType.INVALID_FIRST_NAME , e.type);
        }
       
        
    }
    
    @Test
    public void ifNotProperFirstNameThisShouldReturnFalse(){
        
        try {
        	 boolean result = userValidation.isValidFirstName("bira");
             Assert.assertFalse(result);
        }
        catch(UserInputInvalidException e) {
        	System.out.println(e.getMessage());
        	Assert.assertEquals(UserInputInvalidException.ExceptionType.INVALID_FIRST_NAME , e.type);
        }
        
       
    }
    
    
    @Test
    public void ifProperLastNameThisShouldReturnTrue(){

        try {
        	boolean result = userValidation.isValidLastName("Nath");
            Assert.assertTrue(result);
        }
        catch(UserInputInvalidException e) {
        	System.out.println(e.getMessage());
        	Assert.assertEquals(UserInputInvalidException.ExceptionType.INVALID_LAST_NAME , e.type);
        }
    }
    
    @Test
    public void ifNotProperLastNameThisShouldReturnFalse(){
       
        try {
        	boolean result = userValidation.isValidLastName("Na");
            Assert.assertFalse(result);
        }
        catch(UserInputInvalidException e) {
        	System.out.println(e.getMessage());
        	Assert.assertEquals(UserInputInvalidException.ExceptionType.INVALID_LAST_NAME , e.type);
        }
        
        
        
    }
    
    @Test
    public void ifProperEmailThisShouldReturnTrue(){
        
        try {
        	boolean result = userValidation.isValidEmail("birajit95@gmail.com");
            Assert.assertTrue(result);
        }
        catch(UserInputInvalidException e) {
        	System.out.println(e.getMessage());
        	Assert.assertEquals(UserInputInvalidException.ExceptionType.INVALID_EMAIL , e.type);
        }
        
    }
    
    @Test
    public void ifNotProperEmailThisShouldReturnFalse(){
        
        try {
        	boolean result = userValidation.isValidEmail("birajit95@gmail@.com");
            Assert.assertFalse(result);
        }
        catch(UserInputInvalidException e) {
        	System.out.println(e.getMessage());
        	Assert.assertEquals(UserInputInvalidException.ExceptionType.INVALID_EMAIL , e.type);
        }
    }
    
    @Test
    public void ifProperMobileNumberThisShouldReturnTrue(){
        
        try {
        	boolean result = userValidation.isValidMobileNumber("91 9915518024");
            Assert.assertTrue(result);
        }
        catch(UserInputInvalidException e) {
        	System.out.println(e.getMessage());
        	Assert.assertEquals(UserInputInvalidException.ExceptionType.INVALID_MOBILE_NUMBER , e.type);
        }
        
    }
    
    @Test
    public void ifNotProperMobileNumberThisShouldReturnFalse(){
      
        try {
        	boolean result = userValidation.isValidMobileNumber("1552580025");
            Assert.assertFalse(result);
        }
        catch(UserInputInvalidException e) {
        	System.out.println(e.getMessage());
        	Assert.assertEquals(UserInputInvalidException.ExceptionType.INVALID_MOBILE_NUMBER , e.type);
        }
        
        
    }
    
    @Test
    public void ifProperPasswordThisShouldReturnTrue(){
        
        try {
        	boolean result = userValidation.isValidPassword("birajit123@B");
            Assert.assertTrue(result);
        }
        catch(UserInputInvalidException e) {
        	System.out.println(e.getMessage());
        	Assert.assertEquals(UserInputInvalidException.ExceptionType.INVALID_PASSWORD , e.type);
        }
        
    }
    
    
    @Test
    public void ifNotProperPasswordThisShouldReturnFalse(){
    	
        try {
        	boolean result = userValidation.isValidPassword("birajit123");
            Assert.assertFalse(result);
        }
        catch(UserInputInvalidException e) {
        	System.out.println(e.getMessage());
        	Assert.assertEquals(UserInputInvalidException.ExceptionType.INVALID_PASSWORD , e.type);
        }
        
    }

    
    
   
    
    
    
}
