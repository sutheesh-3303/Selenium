package ListBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Options 
{
  public static void main(String[] args) 
  {
	  WebDriver driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	   driver.get("https://demoapp.skillrary.com");
//	   WebElement monthDropdown = driver.findElement(By.id("month"));
	   WebElement yearDropdown = driver.findElement(By.id("cars"));
	   Select yearSelect=new Select(yearDropdown);
	   
	  List<WebElement> Monthstaken = yearSelect.getOptions();
       int output = Monthstaken.size();
       System.out.println(output);
       yearSelect.selectByIndex(output-1);
       
	   
//	   for(WebElement option:Monthstaken)
//		   {
//			   System.out.println(option.getText());
//		   }
  }
}
