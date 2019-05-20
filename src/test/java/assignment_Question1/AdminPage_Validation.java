package assignment_Question1;

import org.testng.Assert;
import org.testng.annotations.Test;

import assignment_Question1_Methods.Admin_Methods;
import assignment_Question1_Methods.Login_Methods;

public class AdminPage_Validation extends BaseClass {
	
	Admin_Methods am = new Admin_Methods(driver);
	/*This Method is used to Navigate to Admin page and search for admin and reset*/
	@Test(priority =0)
	  public void Admin_Search() throws InterruptedException {
		System.out.println("Login to Orange HRM application");
		Login();
		Admin_Methods ad = new Admin_Methods(driver);
		
		System.out.println("Call Search Admin Method");
				ad.SearchAdmin(adminname);
			
		System.out.println("Reset button");		
				//ad.ResetAdmin();
				
		System.out.println("Add Admin");
				ad.AddAdminUser();
				
			
		}
	
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
