package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnClassname {

	public static void main(String[] args)
	{
	  ChromeDriver drive=new ChromeDriver();
	  drive.manage().window().maximize();
	  
	  drive.get("https://demowebshop.tricentis.com/");
	  drive.findElement(By.className("button-1")).click();

	}

}
