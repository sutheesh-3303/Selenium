package Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//create filestream object
		FileInputStream file =new FileInputStream("./TestData/exaltestdata.xlsx");
				
		//create respective file type object
		 Workbook book = WorkbookFactory.create(file);
		 
		 //call read method
		 String url = book.getSheet("login").getRow(1).getCell(0).getStringCellValue();
//		 System.out.println(url);
		 String email = book.getSheet("login").getRow(1).getCell(1).getStringCellValue();
//		 System.out.println(email);
		 String password = book.getSheet("login").getRow(1).getCell(2).getStringCellValue();
//		 System.out.println(password);
		 
		    WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get(url);

		 
		 	    
				

	}

}
