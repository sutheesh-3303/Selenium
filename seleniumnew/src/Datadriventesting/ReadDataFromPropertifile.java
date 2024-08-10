package Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertifile {

	public static void main(String[] args) throws IOException 
	{
		//create filestream object
		FileInputStream file =new FileInputStream("./TestData/commontestdata.properties");
		//create respective file type object
		Properties prop =new Properties();
		//call read method
		prop.load(file);
		
		String URL = prop.getProperty("url");
	
		String EMAIL = prop.getProperty("email");
		
		String PASSWORD = prop.getProperty("password");
	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(URL);
		driver.findElement(By.name("username")).sendKeys(EMAIL);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
