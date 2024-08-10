package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MethodGetTitle 
{
	public static void main(String[] args) {
		
	
    ChromeDriver drive=new ChromeDriver();
    
    drive.get("https://www.flipkart.com/");
    String title=drive.getTitle();
    System.out.println(title);
    if (title.equals("flipkart")) {
		System.out.println("navigatting success");
	}else
	{
		System.out.println("navigating is faild");
	}
    

	}
}
