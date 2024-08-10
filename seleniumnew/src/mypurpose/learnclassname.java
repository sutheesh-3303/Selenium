package mypurpose;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class learnclassname {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		List<WebElement> headerLinks = driver.findElements(By.tagName("top-menu-triangle"));
		System.out.println("total number of links=" + headerLinks.size());

	}

}
