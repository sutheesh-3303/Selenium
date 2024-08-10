package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToframee {

	public static void main(String[] args) 
	{
		 WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   
		  driver.get("https://www.dream11.com/");
		  WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		  driver.switchTo().frame(frameElement);
		  

		  driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("123344");
		  driver.findElement(By.id("regUser")).click();
		  driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@id='hamburger']")).click();

	}

}
