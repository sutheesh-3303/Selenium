package mypurpose;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwidows {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
	     driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='Click to open multiple popup windows']")).click();
		
		
		switchtowindow(driver,"SignUpPage");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("sutheesh@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sutheesh");
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("sutheesh");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		switchtowindow(driver,"Login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sutheesh@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sutheesh");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		switchtowindow(driver,"SignUp");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mrsutheesh");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sutheesh@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		switchtowindow(driver,"multipleWindow?sublist=2");
		driver.close();
		
	}
	public static void switchtowindow(WebDriver driver,String expurl)
	{
		Set<String> childwindows = driver.getWindowHandles();
		for(String id:childwindows)
		{
			String URL = driver.switchTo().window(id).getCurrentUrl();
			if(URL.contains(expurl))
			{
				break;
			}
		}
	}

}
