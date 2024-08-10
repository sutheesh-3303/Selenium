package dataProvider;

import java.time.Duration;

import javax.xml.crypto.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLearndataProvider 
{
	
//	1. Same Class
//    @Test(dataProvider = "DataSender")
//	2.Different Class
	@Test(dataProviderClass = Login.class, dataProvider = "DataSender")
    public void login(String[] datas)
    {
    	WebDriver driver= new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	driver.get("https://www.instagram.com/accounts/login/?next=%2Flogin%2F&source=desktop_nav");
    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(datas[0]);
    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(datas[1]);
    	
    }
}
