package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTagName 
{
  public static void main(String[] args) 
  {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoapp.skillrary.com/");
	List<WebElement> images = driver.findElements(By.tagName("img"));
	List<WebElement> Links = driver.findElements(By.tagName("a"));
	List<WebElement> Buttons = driver.findElements(By.tagName("button"));
	
	System.out.println("Tottal images =" +images.size());
	System.out.println("Tottal Links =" +Links.size());
	System.out.println("Tottal Buttons =" +Buttons.size());
	
  }
}
