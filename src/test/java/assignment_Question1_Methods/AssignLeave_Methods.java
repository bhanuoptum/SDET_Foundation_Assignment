package assignment_Question1_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AssignLeave_Methods {

	WebDriver aldriver;
	
	public AssignLeave_Methods(WebDriver rdriver)
	{
		aldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH, using="//a[@id='menu_leave_viewLeaveModule']/b")
	@CacheLookup
	public
	WebElement leave;
	
	//a[@id='menu_leave_assignLeave']
	
	@FindBy(how=How.XPATH, using="//a[@id='menu_leave_assignLeave']")
	@CacheLookup
	public
	WebElement assignleave;
	
	@FindBy(how=How.XPATH, using="/h1[contains(text(),'Assign Leave')]")
	@CacheLookup
	public
	WebElement header;
	  
	@FindBy(id="assignleave_txtEmployee_empName")
	@CacheLookup
	public
	WebElement employeename;
	
	@FindBy(how=How.XPATH, using="//select[@id='assignleave_txtLeaveType']")
	@CacheLookup
	public
	WebElement leavetype;
	
	@FindBy(how=How.XPATH, using="//input[@id='assignleave_txtFromDate']")
	@CacheLookup
	public
	WebElement fromdate;
	
	@FindBy(how=How.XPATH, using="//input[@id='assignleave_txtToDate']")
	@CacheLookup
	public
	WebElement todate;
	
	
	@FindBy(how=How.XPATH, using="//select[@id='assignleave_duration_duration']")
	@CacheLookup
	public
	WebElement duration;
	
	@FindBy(id="assignBtn")
	@CacheLookup
	public
	WebElement assignbtn;

	/*This method is used to Navigate to Leave-->AssignLeave page*/
	public void GotoAssignLeave() throws InterruptedException{
		 leave.click();
		 assignleave.click();
		 Thread.sleep(3000);
		// Assert.assertEquals("Assign Leave", header.getText());
	}
	
	public void SelectByIndex(WebElement elem, int index){
		Select sel = new Select(elem);
		 sel.selectByIndex(index);
	}
	
	public void setEMPName(String name)
	{
		employeename.clear();
		employeename.sendKeys(name);
	}
	
	/*This method is used to enter details on Assign Leave page and submit Assign*/
	public void AssignLeavePage(String empName) throws InterruptedException{
		//employeename.sendKeys("Joseph User");
		setEMPName(empName);
		Thread.sleep(2000);
		SelectByIndex(leavetype,1);
		Thread.sleep(2000);
		fromdate.clear();
		fromdate.sendKeys("2019-05-22");
		Thread.sleep(2000);
		todate.clear();
		todate.sendKeys("2019-05-27");
		Thread.sleep(4000);
		((JavascriptExecutor) aldriver).executeScript("arguments[0].click();", assignbtn);
		assignbtn.click();
	
		}
	
	}
