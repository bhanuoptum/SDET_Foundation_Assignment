package assignment_Question1_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Admin_Methods {

	WebDriver adriver;
		
	public Admin_Methods(WebDriver rdriver)
	{
		adriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH, using="//a[@id='menu_admin_viewAdminModule']/b")
	@CacheLookup
	public
	WebElement admin;
	
	@FindBy(how=How.XPATH, using="//input[@id='searchSystemUser_userName']")
	@CacheLookup
	public
	WebElement adminusername;
	
	@FindBy(id="searchSystemUser_userType")
	@CacheLookup
	public
	WebElement adminuserrole;
		
	@FindBy(id="searchBtn")
	@CacheLookup
	public
	WebElement adminsearchbtn;

	@FindBy(how=How.XPATH, using="//input[@name='chkSelectRow[]']")
	@CacheLookup
	public
	WebElement checkbox;
		
	@FindBy(id="btnAdd")
	@CacheLookup
	public
	WebElement Addbtn;
	
	@FindBy(id="resetBtn")
	@CacheLookup
	public
	WebElement resetbtn;
	
	@FindBy(id="btnCancel")
	@CacheLookup
	public
	WebElement cancelbtn;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'thomas.fleming')]")
	@CacheLookup
	public
	WebElement resultname;
	
	
	public String getResult(){
		return resultname.getText();
		
	} 	
	public String getAdminname()
	{
		return adminusername.getText();
	}
	
	public void setAdminName(String uname)
	{
		adminusername.sendKeys(uname);
	}
	public void SearchAdmin(String name){		
		System.out.println("Click Admin tab");
		admin.click();
		System.out.println("Enter Admin name");
		setAdminName(name);
		System.out.println("Enter User Role");
		SelectByIndex(adminuserrole,0);
		adminsearchbtn.click();		
		Assert.assertEquals(getResult(),name,"Result not Matching");
	}

	public void SelectByIndex(WebElement elem, int index){
		Select sel = new Select(elem);
		 sel.selectByIndex(index);
	}
	public void ResetAdmin(){
		System.out.println("Click Reset");	
		resetbtn.click();
		//Assert.assertEquals(getAdminname(), " ", "Result not matching");
	}

	
	public void AddAdminUser() throws InterruptedException{
		/*System.out.println("Enter Admin name");
		adminusername.sendKeys("john.smith");
		System.out.println("Enter User Role");
		SelectByIndex(adminuserrole,0);
		adminsearchbtn.click();	*/
		System.out.println("Click the checkbox");
		checkbox.click();
		System.out.println("Click Add button");
		Addbtn.click();
		Thread.sleep(2000);
		cancelbtn.click();
		Thread.sleep(3000);
			
		}
	}

