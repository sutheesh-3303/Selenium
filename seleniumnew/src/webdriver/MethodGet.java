package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class MethodGet 
{
  public static void main(String[] args) 
  {
	ChromeDriver dr=new ChromeDriver();
//	dr.get("https://www.flipkart.com/"); 
	dr.get("https://www.instagram.com/");
	String title=dr.getTitle();
	System.out.println(title);

	if (title.equals("Instagram")) 
	{
		System.out.println("navigatting success");
	}else
	{
		System.out.println("navigating is faild");
	}
	dr.close();
	
 }
}
