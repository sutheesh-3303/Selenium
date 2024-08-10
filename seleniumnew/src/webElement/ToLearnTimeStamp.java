package webElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnTimeStamp {

	public static void main(String[] args) throws IOException 
	{
		LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		File temp = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorShots/Shot1.png");
		FileHandler.copy(temp, dest);

	}

}
