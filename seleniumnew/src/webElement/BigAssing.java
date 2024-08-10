package webElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class BigAssing {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		String parentId = driver.getWindowHandle();
		driver.findElement(By.linkText("Vtiger")).click();
		
		Set<String> window = driver.getWindowHandles();
		for(String id:window) 
		{
			String ref = driver.switchTo().window(id).getCurrentUrl();
			if(ref.contains("https://demo.vtiger.com"))
			{
				break;
				
				
			}
		}
		driver.findElement(By.id("loginspan")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sutheesh@wd");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pasword");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(20000);
		TakesScreenshot take=(TakesScreenshot) driver;
		File temp=take.getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorShots/Shot1.png");
		FileHandler.copy(temp, dest);
		WebElement error = driver.findElement(By.id(""));
		String colour = error.getCssValue("color");
		System.out.println(colour);
		driver.switchTo().window(parentId);
		WebElement username = driver.findElement(By.id("username"));
				username.clear();
				username.sendKeys("sughdtuww");
				WebElement password = driver.findElement(By.id("password"));
				password.clear();
				password.sendKeys("sughdtuww");
				driver.findElement(By.xpath("//button[@class='button buttonBlue']"));
				WebElement singerrormsg = driver.findElement(By.id("validationMessage"));
				System.out.println(singerrormsg.getText());
				LocalDateTime systemTime=LocalDateTime.now();
				String time = systemTime.toString().replace(":", "-");
				File screenshot = driver.findElement(By.id("validationMessage")).getScreenshotAs(OutputType.FILE);
				File desti=new File("./errorShots/errorShotbigassin"+time+".png");
				FileHandler.copy(screenshot, desti);
				
				
				
				
			}
		}	
		
		

	

	
	
