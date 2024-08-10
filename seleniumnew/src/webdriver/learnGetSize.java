package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnGetSize 
{
 public static void main(String[] args) 
 {
	ChromeDriver drive=new ChromeDriver();
	   drive.get("https://www.amazon.in/");
	Dimension size = drive.manage().window().getSize();
	System.out.println(size);
	System.out.println(size.getHeight());
	System.out.println(size.getWidth());
	
	drive.manage().window().setSize(new Dimension(700, 500));
	
	
}
}
