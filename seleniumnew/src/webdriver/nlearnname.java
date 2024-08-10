package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class nlearnname 
{
    public static void main(String[] args) 
    {  
    	ChromeDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	
    	driver.get("https://demowebshop.tricentis.com/");
    	driver.findElement(By.name("q")).sendKeys("sutheesh");
		
	}
}
