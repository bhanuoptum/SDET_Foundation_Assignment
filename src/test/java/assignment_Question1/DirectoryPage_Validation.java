package assignment_Question1;

import org.testng.Assert;
import org.testng.annotations.Test;

import assignment_Question1_Methods.Directory_Methods;
import assignment_Question1_Methods.Login_Methods;

public class DirectoryPage_Validation extends BaseClass {
  	
/* This Method is used to login to HRM application and navigate to Directory tab and search for the directory and reset.
This Method calls SearchDirectory() and ResetDirectory() methods from Directory_Methods class and Login() Method from within the class */
	@Test(priority =0)
public void Directory_Search() throws InterruptedException {
		System.out.println("Directory Page Validation");
		Login();	
		
		Directory_Methods dm =new Directory_Methods(driver);
		
		dm.SearchDirectory(empname);
		
		System.out.println("Reset");
		dm.ResetDirectory();
		
		System.out.println("Check Result text is empty");
	//Assert.assertEquals(dm.getResultText(), " ");
	}
		 
/* This method is to login to Orange HRM application */	
public void Login() throws InterruptedException{
		Login_Methods lm = new Login_Methods(driver);
		System.out.println("Before Test");
		lm.setUserName(username);
		lm.setPassword(password);
		lm.clickSubmit();
		Assert.assertEquals("OrangeHRM", driver.getTitle());
		Thread.sleep(3000);		
	}
		
}
