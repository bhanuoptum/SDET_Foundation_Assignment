package assignment_Question1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import testUtilities.ReadProperty;


public class BaseClass{
	
		ReadProperty readconfig=new ReadProperty();
		
		public String baseURL=readconfig.getApplicationURL();
		public String username=readconfig.getUsername();
		public String password=readconfig.getPassword();
		public String empname=readconfig.getEmpName();
		public String adminname=readconfig.getAdminName();
		public String empName = readconfig.getempName();
		 public static WebDriver driver ;
		 public static WebDriverWait wait;
		
		 
		
		@Parameters("browser")
		@BeforeClass
		public void setUp(String browserType) throws InterruptedException
		{	
			switch(browserType) {
			case "FireFox":
				System.out.println("Before Class");
				/*System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
				driver = new FirefoxDriver();*/
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	 			capabilities.setCapability("marionette", true);
	 			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
	 			driver = new FirefoxDriver(capabilities);
	 			driver.manage().window().maximize();
	 			driver.get(baseURL);
		 			Thread.sleep(3000);
			break;
			case "Chrome":
				System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
				ChromeOptions options = new ChromeOptions();
				options.addArguments("test-type");
				options.addArguments("start-maximized");
				options.addArguments("--enable-automation");
				options.addArguments("test-type=browser");
				options.addArguments("disable-infobars");
//				options.addArguments("disable-extensions");
				driver = new ChromeDriver(options);
				driver.navigate().to(baseURL);
				Thread.sleep(3000);
	 		break;
			case "IE":
 				System.out.println("i am in IE");
 				DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
 		        caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
 		        caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
 				System.setProperty("webdriver.ie.driver", readconfig.getIEPath());
 				driver = new InternetExplorerDriver(caps);
 				driver.get(baseURL);
	 			Thread.sleep(3000);
 				break;	
			}	
			
		}
		
		@AfterClass
		public void tearDown()
		{
			driver.quit();
		}
		
		
	}


