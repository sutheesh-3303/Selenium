package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframe {

	public static void main(String[] args) 
	{
		 WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   
		  driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		  WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		  driver.switchTo().frame(frameElement);
		  driver.switchTo().frame(0);
		  

		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sutheeesh@gmail.com");

	}

}
