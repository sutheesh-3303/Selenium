package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextScriptlogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file =new FileInputStream("./TestData/exaltestdata.xlsx");
		 Workbook book = WorkbookFactory.create(file);
		 String url = book.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		 String email = book.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		 String password = book.getSheet("login").getRow(2).getCell(2).getStringCellValue();
		 
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		LoginPage login =new LoginPage(driver);
		login.getLoginLink().click();
		login.getEmilTextfiled().sendKeys(email);
		login.getPasswordTextfiled().sendKeys(password);
		login.getLoginButton().click();

	}

}
