package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnmoveToElement {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions move=new Actions(driver);
		move.moveToElement(fashion).perform();
		WebElement footwear = driver.findElement(By.partialLinkText("Men Footwear"));
		move.moveToElement(footwear).perform();
		driver.findElement(By.partialLinkText("Men's Casual Shoes")).click();

	}

}
