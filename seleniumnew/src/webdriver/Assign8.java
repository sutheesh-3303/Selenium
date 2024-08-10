package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign8 
{
    public static void main(String[] args) 
    {
		ChromeDriver drive=new ChromeDriver();
		drive.manage().window().maximize();
		
		drive.get("https://demowebshop.tricentis.com/");
		 drive.findElement(By.xpath("//a[text()='Log in']")).click();
		 drive.findElement(By.xpath("//input[@class='email']")).sendKeys("sutheesh1672002@gmail.com");
		 drive.findElement(By.xpath("//input[@class='password']")).sendKeys("sutheesh");
	 drive.findElement(By.xpath("//input[@name='RememberMe']")).click();
		 drive.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		 String Homee = drive.getCurrentUrl();
		 drive.close();
	      if (Homee.equals("https://demowebshop.tricentis.com/")) 
	  	{
	  		System.out.println("Login is successfull");
	  	}else
	  	{
	  		System.out.println("faild");
	  	}
	      
	}
}
