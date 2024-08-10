package ListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple 
{
 public static void main(String[] args)
 {
	   WebDriver driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	   driver.get("https://demoapp.skillrary.com/");
	   WebElement dayDropdown = driver.findElement(By.id("cars"));
	   Select carsSelect=new Select(dayDropdown);
	   
	   System.out.println(carsSelect.isMultiple());
	   
	   driver.get("https://www.facebook.com/signup");
	   WebElement yearDropdown = driver.findElement(By.id("year"));
	   Select yearSelect=new Select(yearDropdown);
	   
	   System.out.println(yearSelect.isMultiple());
 }

}

