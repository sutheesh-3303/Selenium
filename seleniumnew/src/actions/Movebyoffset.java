package actions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movebyoffset {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://yonobusiness.sbi/");
		driver.findElement(By.partialLinkText("LOGIN")).click();
		driver.findElement(By.id("password")).sendKeys("sutheesh");
		driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		Actions move=new Actions(driver);
		move.moveByOffset(1210,305). click().perform();
		move.clickAndHold().perform();
		

	}

}
