package webdriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class LearnQuit
{
  public static void main(String[] args)  
  {
	   ChromeDriver drive =new ChromeDriver();
	   
	   drive.get("");
	  
//	   drive.close();
	   drive.quit();
	   
   } 
}
