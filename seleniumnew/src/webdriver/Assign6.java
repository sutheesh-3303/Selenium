package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign6 
{
    public static void main(String[] args) 
    {
		ChromeDriver drive= new ChromeDriver();
		drive.manage().window().maximize();
		
		drive.get("https://demowebshop.tricentis.com/"); 
		drive.findElement(By.linkText("Register")).click();
		drive.findElement(By.name("Gender")).click();
		drive.findElement(By.id("FirstName")).sendKeys("sutheesh");
		drive.findElement(By.id("LastName")).sendKeys("kumar");
		drive.findElement(By.id("Email")).sendKeys("sutheesh1672002@gmail.com");
		drive.findElement(By.id("Password")).sendKeys("sutheesh");
		drive.findElement(By.id("ConfirmPassword")).sendKeys("sutheesh");
		drive.findElement(By.id("register-button")).click();
	}
}
