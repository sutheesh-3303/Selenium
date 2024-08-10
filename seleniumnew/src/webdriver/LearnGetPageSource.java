package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGetPageSource 
{
  public static void main(String[] args) 
  {
	  ChromeDriver cd=new ChromeDriver();
	  cd.get("https://www.instagram.com/");
	 String sourcecode = cd.getPageSource();
	 System.out.println(sourcecode);
	 
  }
}
