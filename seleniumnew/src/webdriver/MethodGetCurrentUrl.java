package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MethodGetCurrentUrl 
{
	public static void main(String[] args) {
		
	
	ChromeDriver drive=new ChromeDriver();

	drive.get("https://www.instagram.com/");
	String title=drive.getCurrentUrl();
	System.out.println(title);

	if (title.equals("https://www.instagram.com/")) 
	{
		System.out.println("navigatting success");
	}else
	{
		System.out.println("navigating is faild");
	}
}
}
