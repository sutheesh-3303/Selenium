package UnitTestAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public LoginPage(WebDriver driver) 
	{
	   PageFactory.initElements(driver, this);
	}
	
	 @FindBy(id = "Email")
	   private WebElement emilTextfiled;
	   
	   @FindBy(id = "Password")
	   private WebElement passwordTextfiled;
	   
	   @FindBy(xpath = "//input[@value='Log in']")
	   private WebElement loginButton;

	public WebElement getEmilTextfiled() 
	{
		return emilTextfiled;
	}

	public WebElement getPasswordTextfiled() 
	{
		return passwordTextfiled;
	}

	public WebElement getLoginButton() 
	{
		return loginButton;
	}
	   
	   
}