package assignmentssss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class petapp {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
//		driver.switchTo().frame(0);
		WebElement mapFrame = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
		driver.switchTo().frame(mapFrame);
		driver.findElement(By.id("region-27")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("suthe33@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sutheeshsss@");
		driver.findElement(By.xpath("//input[@id='cpass']")).sendKeys("sutheeshsss@");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sutheesh");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9499747287");
		WebElement usertype = driver.findElement(By.xpath("//select[@id='user-type']"));
		Select usertypeSelect=new Select(usertype);
		usertypeSelect.selectByIndex(2);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement successmsg = driver.findElement(By.xpath("//b[text()='Thank you for registering!']"));
		System.out.println(successmsg.getText());
		

	}

}
