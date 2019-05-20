package assignment_Question1;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import assignment_Question1_Methods.AssignLeave_Methods;
import assignment_Question1_Methods.Login_Methods;

public class AssignLeave_Validation extends BaseClass{
	
	/*This Method is used to submit leave */		
  @Test
  public void AssignLeave() throws InterruptedException {
	  
	  Login();
	  AssignLeave_Methods alm = new AssignLeave_Methods(driver);
	  System.out.println("Click on Leave-->Assign Leave");
	  alm.GotoAssignLeave();
	  System.out.println("Landed on Assign Leave page");
	  System.out.println("Enter Details on Assign Leave Page");
	  alm.AssignLeavePage(empName);
	  
        
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
