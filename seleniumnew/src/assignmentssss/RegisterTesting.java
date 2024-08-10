package assignmentssss;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTesting {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file =new FileInputStream("./TestData/exaltestdata.xlsx");
		Workbook book = WorkbookFactory.create(file);
		 String url = book.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		 String Firstname = book.getSheet("login").getRow(1).getCell(3).getStringCellValue();
		 String LastName = book.getSheet("login").getRow(1).getCell(4).getStringCellValue();
		 String email = book.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		 String password = book.getSheet("login").getRow(2).getCell(2).getStringCellValue();
		 String ConformPassword = book.getSheet("login").getRow(1).getCell(5).getStringCellValue();
		
		
		
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	   driver.get(url);
	   driver.findElement(By.linkText("Register")).click();
	   driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	   driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(Firstname);
	   driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(LastName);
	   driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
	   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	   driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(ConformPassword);
	   driver.findElement(By.xpath("//input[@id='register-button']")).click();
	}

}
