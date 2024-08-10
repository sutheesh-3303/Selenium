package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	//initialize
	public WelcomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	//declaration
   @FindBy(linkText = "Register")
   private WebElement registerLink;

   //getter
public WebElement getRegisterLink() {
	return registerLink;
}
   
   
}
