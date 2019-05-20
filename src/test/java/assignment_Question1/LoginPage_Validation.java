package assignment_Question1;

import org.testng.Assert;
import org.testng.annotations.Test;

import assignment_Question1_Methods.Login_Methods;

public class LoginPage_Validation extends BaseClass{

	/* This Method is to validate Login page */
	@Test
	public void Login_Test() throws InterruptedException {
		Login_Methods lm = new Login_Methods(driver);
		System.out.println("Before Test");
		lm.setUserName(username);
		lm.setPassword(password);
		lm.clickSubmit();
		Assert.assertEquals("OrangeHRM", driver.getTitle());
				}
	
}
	
	
	
	
	

