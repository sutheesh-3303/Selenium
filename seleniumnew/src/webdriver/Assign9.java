package webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign9 
{
    public static void main(String[] args) 
    {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/s?k=mobile");
	    driver.findElement(By.xpath("//span[text()='Redmi']/../..//i[@class='a-icon a-icon-checkbox']")).click();
		
		
	}
}
