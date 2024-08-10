package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptSkillary {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	   FileInputStream file=new FileInputStream("./TestData/exaltestdata.xlsx");
	  Workbook book = WorkbookFactory.create(file);
	  String url = book.getSheet("login").getRow(2).getCell(0).getStringCellValue();
	  String email = book.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	  String password = book.getSheet("login").getRow(1).getCell(2).getStringCellValue();
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  driver.get(url);
	  SkillaryWelcome welcome=new SkillaryWelcome(driver);
	  welcome.getLoginLink().click();
	  welcome.getEmailTextfild().sendKeys(email);
	  welcome.getPasswordTextfild().sendKeys(password);
	  welcome.getLoginButton().click();
	  

	}

}