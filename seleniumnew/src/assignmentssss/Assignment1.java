package assignmentssss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 
{
   public static void main(String[] args) 
   {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	 driver.get("https://demowebshop.tricentis.com/");
	 driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']")).click();
	 WebElement Successmsg = driver.findElement(By.xpath("//p[@class='content']"));
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.invisibilityOf(Successmsg));
	 driver.findElement(By.linkText("Log in")).click();
	 
	 
	 
	 
	 
	 
	 
	 }
}
