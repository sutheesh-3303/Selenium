package ListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultiselect {

	public static void main(String[] args)
	{
		 WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   
		   driver.get("https://demoapp.skillrary.com/");
		   WebElement dayDropdown = driver.findElement(By.id("cars"));
		   Select carsSelect=new Select(dayDropdown);
		   carsSelect.selectByIndex(5);
	       carsSelect.selectByValue("99");
	       carsSelect.selectByVisibleText("INR 200 - INR 299 ( 3 )");
//	       carsSelect.deselectByIndex(5);
//	       carsSelect.deselectByValue("99");
//	       carsSelect.deselectByVisibleText("INR 200 - INR 299 ( 3 )");
//	       carsSelect.deselectAll();
	       
       
	}

}
