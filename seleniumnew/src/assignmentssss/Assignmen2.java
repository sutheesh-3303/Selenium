package assignmentssss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmen2 
{
	public static void main(String[] args) 
	{
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   
		   driver.get("https://demowebshop.tricentis.com/books");
		   WebElement SortbyDropdown = driver.findElement(By.id("products-orderby"));
		   Select ProductSelect=new Select(SortbyDropdown);
		   ProductSelect.selectByIndex(2);
		   
		   WebElement DisplayDropdown = driver.findElement(By.id("products-pagesize"));
		   Select PagesizeSelect=new Select(DisplayDropdown);
		   PagesizeSelect.selectByVisibleText("12");
		   
		   WebElement ViewasDropdown = driver.findElement(By.id("products-viewmode"));
		   Select viewmodeSelect=new Select(ViewasDropdown);
		   viewmodeSelect.selectByIndex(1);
		   
		   
	}

}
