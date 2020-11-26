package com.user_ragistration;

import  org.junit.Assert;

import org.junit.Test;


public class UserValidationTest 
{
   
    @Test
    public void ifProperFirstNameThisShouldReturnTrue(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.isValidFirstName("Birajit");
        Assert.assertTrue(result);
    }
    
    @Test
    public void ifNotProperFirstNameThisShouldReturnFalse(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.isValidFirstName("bira");
        Assert.assertFalse(result);
    }
    
    
    @Test
    public void ifProperLastNameThisShouldReturnTrue(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.isValidLastName("Nath");
        Assert.assertTrue(result);
    }
    
    @Test
    public void ifNotProperLastNameThisShouldReturnFalse(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.isValidLastName("Na");
        Assert.assertFalse(result);
    }
    
    @Test
    public void ifProperEmailThisShouldReturnTrue(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.isValidEmail("birajit95@gmail.com");
        Assert.assertTrue(result);
    }
    
    @Test
    public void ifNotProperEmailThisShouldReturnFalse(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.isValidEmail("birajit95@gmail@.com");
        Assert.assertFalse(result);
    }
    
    @Test
    public void ifProperMobileNumberThisShouldReturnTrue(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.isValidMobileNumber("91 9915518024");
        Assert.assertTrue(result);
    }
    
    @Test
    public void ifNotProperMobileNumberThisShouldReturnFalse(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.isValidMobileNumber("1552580025");
        Assert.assertFalse(result);
    }
    
    @Test
    public void ifProperPasswordThisShouldReturnTrue(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.isValidPassword("birajit123@B");
        Assert.assertTrue(result);
    }
    
    @Test
    public void ifNotProperPasswordThisShouldReturnFalse(){
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.isValidPassword("birajit123");
        Assert.assertFalse(result);
    }

    
    
   
    
    
    
}
