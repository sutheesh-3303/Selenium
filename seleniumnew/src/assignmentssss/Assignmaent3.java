package assignmentssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmaent3 {

	public static void main(String[] args) 
	{
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   
		  driver.get("https://www.dream11.com/");

		  driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("123344");
		  driver.findElement(By.id("regUser")).click();
		  driver.findElement(By.xpath("//label[text()='Please enter a valid 10 digit mobile number.']")).getText();
		  ;
	}

}
