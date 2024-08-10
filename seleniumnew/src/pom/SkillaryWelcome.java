package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryWelcome 
{
	public SkillaryWelcome(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
     @FindBy(linkText = "LOGIN")
     private WebElement loginLink;
     
     @FindBy(id = "email")
     private WebElement emailTextfild;
     
     @FindBy(id = "password")
     private WebElement passwordTextfild;
     
     @FindBy(xpath = "//button[text()='Login']")
     private WebElement loginButton;

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getEmailTextfild() {
		return emailTextfild;
	}

	public WebElement getPasswordTextfild() {
		return passwordTextfild;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
     
     
}
