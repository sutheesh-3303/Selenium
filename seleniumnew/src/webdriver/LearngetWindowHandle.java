package webdriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearngetWindowHandle 
{
   public static void main(String[] args) 
   {
	 ChromeDriver drive = new ChromeDriver();
	 drive.manage().window().maximize();
	 
	 drive.get("https://demowebshop.tricentis.com/");
      String windowId = drive.getWindowHandle();
     System.out.println(windowId);
	 
}
}
