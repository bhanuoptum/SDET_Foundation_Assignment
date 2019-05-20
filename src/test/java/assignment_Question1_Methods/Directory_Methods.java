package assignment_Question1_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Directory_Methods{

	WebDriver ddriver;
	
	public Directory_Methods(WebDriver rdriver)
	{
		ddriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']/b")).click();
	@FindBy(how=How.XPATH, using="//a[@id='menu_directory_viewDirectory']/b")
	@CacheLookup
	public
	WebElement directory;
	 
	//driver.findElement(By.xpath("//input[@id='searchDirectory_emp_name_empName']")).sendKeys("Linda");
	@FindBy(id="searchDirectory_emp_name_empName")
	@CacheLookup
	WebElement empName;
	
	//WebElement jobtitle = driver.findElement(By.xpath("//select[@id='searchDirectory_job_title']"));
	@FindBy(id="searchDirectory_job_title")
	@CacheLookup
	public
	WebElement jobtitle;
	
	 //WebElement location = driver.findElement(By.xpath("//select[@id='searchDirectory_location']"));
	@FindBy(id="searchDirectory_location")
	@CacheLookup
	public
	WebElement location;
	 
	//driver.findElement(By.id("searchBtn")).click();
	@FindBy(id="searchBtn")
	@CacheLookup
	public
	WebElement searchbtn;
	
	//driver.findElement(By.id("resetBtn")).click();
	@FindBy(id="resetBtn")
	@CacheLookup
	WebElement resetbtn;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	//driver.findElement(By.xpath("//table[@id='resultTable']//li/b")).getText();
	@FindBy(how=How.XPATH, using="//table[@id='resultTable']//li/b")
	@CacheLookup
	public
	WebElement resulttable;
	
	
public String getResultText(){
		return resulttable.getText();
		
	}

public void setEmpName(String name)
{
	empName.sendKeys(name);
}
	
public String getEmpname()
{
	return empName.getText();
}

/* This Method is used to Search for a specific Directory in the Directory Page */
public void SearchDirectory(String name){		
		System.out.println("Click Directory");
		directory.click();
		System.out.println("set emp name as Linda from config file");
		//empName.sendKeys("Linda");
		setEmpName(name);
		SelectByIndex(jobtitle,0);
		SelectByIndex(location,0);
		System.out.println("Click Search");
		searchbtn.click();
		System.out.println("Check Result text");
		Assert.assertEquals(getResultText(), name, "Result not Matching");
}

/* This Method is used to Select the value from drop down by specific index*/	
public void SelectByIndex(WebElement elem, int index){
		Select sel = new Select(elem);
		 sel.selectByIndex(index);
	}

/* This Method is used to click the Reset button on Directory Page */
public void ResetDirectory(){		
	resetbtn.click();

}

	
}
