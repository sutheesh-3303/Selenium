package UnitTestAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcompage 
{
	public Welcompage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	 @FindBy(linkText = "Log in")
	   private WebElement loginLink;
	 
	public WebElement getLoginLink() 
	{
		return loginLink;
	}
}	
