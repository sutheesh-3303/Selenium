package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		skillarypom textfield =new skillarypom (driver);
		textfield.getSearchTextfield().sendKeys("selenium",Keys.ENTER);
		textfield.getSearchTextfield().sendKeys("testng",Keys.ENTER);
		
		
		
	
		
//		noramal type it give staleElementException
//		WebElement search = driver.findElement(By.id("navbar-search-input"));
//		search.sendKeys("selenium",Keys.ENTER);
//		search.sendKeys("testng",Keys.ENTER);

	}

}
