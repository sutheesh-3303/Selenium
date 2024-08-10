package UnitTestAssignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass2 
{
	public WebDriver driver;
	public Welcompage welcome;
	public Properties prop;
	@BeforeClass
	public void OpenBrowser() throws IOException 
	{
		FileInputStream file =new FileInputStream("./TestData/commontestdata.properties");
	    prop =new Properties();
		prop.load(file);
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(prop.getProperty("url"));
	}
	@BeforeMethod
	public void login() 
	{
		
		welcome=new Welcompage(driver);
    	welcome.getLoginLink().click();
    	
    	LoginPage login=new LoginPage(driver);
    	login.getEmilTextfiled().sendKeys(prop.getProperty("email"));
    	login.getPasswordTextfiled().sendKeys(prop.getProperty("password"));
    	login.getLoginButton().click();
	}
	@AfterMethod
	public void logout()
	{
		HomePage logout=new HomePage(driver);
		logout.getLogoutLink().click();
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}
   
}
