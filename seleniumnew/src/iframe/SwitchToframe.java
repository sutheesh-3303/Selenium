package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToframe {

	public static void main(String[] args) 
	{

		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   
		  driver.get("https://www.dream11.com/");
//		  driver.switchTo().frame(0);
//		  driver.switchTo().frame("send-sms-iframe")
          WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		  driver.switchTo().frame(frameElement);
		  

		  driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("123344");
		  driver.findElement(By.id("regUser")).click();
		  WebElement errormsg = driver.findElement(By.xpath("//label[text()='Please enter a valid 10 digit mobile number.']"));
		  System.out.println(errormsg.getText());
		  

	}
                                                                                                                                 
}
