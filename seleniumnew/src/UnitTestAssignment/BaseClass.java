package UnitTestAssignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public WebDriver driver;
	public  Workbook book;
	public Welcompage welcome;
    @BeforeClass
    public void openBrowser() throws EncryptedDocumentException, IOException
    {
    	FileInputStream file =new FileInputStream("./TestData/exaltestdata.xlsx");
        book = WorkbookFactory.create(file);
    	String url = book.getSheet("login").getRow(1).getCell(0).getStringCellValue();
    	
    	
        driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	driver.get(url);
    }
    @BeforeMethod
    public void LoginBrowser()
    {
    	welcome=new Welcompage(driver);
    	welcome.getLoginLink().click();
    	
    	LoginPage login=new LoginPage(driver);
    	String email = book.getSheet("login").getRow(1).getCell(1).getStringCellValue();
    	login.getEmilTextfiled().sendKeys(email);
    	String password = book.getSheet("login").getRow(1).getCell(5).getStringCellValue();
    	login.getPasswordTextfiled().sendKeys(password);
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
