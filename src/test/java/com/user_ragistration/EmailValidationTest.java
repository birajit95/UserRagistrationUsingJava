package com.user_ragistration;

import java.util.Arrays;
import java.util.Collection;

import  org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailValidationTest {

	private String email;
	private boolean resultStatus;
	
	public EmailValidationTest(String email, boolean resultStatus) {
		this.email = email;
		this.resultStatus = resultStatus;
	}
	
	
	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return Arrays.asList(new Object[][] {
									{"abc",false},
									{"abc@.com.my",false},
									{"abc123@gmail.a",false},
									{"abc123@.com",false}, 
									{"abc123@.com.com",false},
									{".abc@abc.com", false},
									{"abc()*@gmail.com",false},		
									{"abc@%*.com",false},
									{"abc..2002@gmail.com",false},
									{"abc.@gmail.com", false},
									{"abc@abc@gmail.com",false},
									{"abc@gmail.com.1a",false},
									{"abc@gmail.com.aa.au",false},
									{"abc@yahoo.com",true}, 
									{"abc-100@yahoo.com",true},
									{"abc.100@yahoo.com",true},
									{"abc111@abc.com",true},
									{"abc-100@abc.net",true},
									{"abc.100@abc.com.au",true},
									{"abc@1.com", false},
									{"abc@gmail.com.com",true},
									{"abc+100@gmail.com", true}

							});
	}
	
	@Test
	public void testEmail() {
		
		UserValidation emailValidate = new UserValidation();
		try {
			boolean result = emailValidate.isValidEmail(this.email);
			Assert.assertEquals(this.resultStatus, result);
		}
		catch(UserInputInvalidException e) {
			System.out.println(e.getMessage()+": "+this.email);
			Assert.assertEquals(UserInputInvalidException.ExceptionType.INVALID_EMAIL, e.type);
		}
		
		
		
	}
	
}
















