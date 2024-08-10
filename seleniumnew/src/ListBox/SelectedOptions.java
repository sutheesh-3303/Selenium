package ListBox;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectedOptions {

	public static void main(String[] args)
	{
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   
		   driver.get("https://demoapp.skillrary.com/");
		   WebElement pricelistbox = driver.findElement(By.id("cars"));
		   Select priceSelect=new Select(pricelistbox);
		   priceSelect.selectByIndex(0);
		   priceSelect.selectByIndex(1);
		   priceSelect.selectByIndex(2);
		   
		   
//	1.	   getFirstSelectedOption
		   WebElement FirstSelect = priceSelect.getFirstSelectedOption();
		   System.out.println(FirstSelect.getText());
		   
//	2.	   getAllSelectedOptions
//		   List<WebElement> allselected = priceSelect.getAllSelectedOptions();
//		   System.out.println(allselected.size());
//		   
//		   for(WebElement option:allselected)
//		   {
//			   System.out.println(option.getText());
//		   }
//	3.    getOption()
		   
//		   List<WebElement> allselected = priceSelect.getOptions();
//		   System.out.println(allselected.size());
//		   
//		   for(WebElement option:allselected)
//			   {
//				   System.out.println(option.getText());
//			   }

		   
		   
		   
		 
		   
		   
		   
		  

	}

}
