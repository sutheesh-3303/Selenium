package UnitTestAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
    @FindBy(partialLinkText = "BOOKS")
    private WebElement BooksLink;

	public WebElement getBooksLink() 
	{
		return BooksLink;
	}
	@FindBy(id = "products-orderby")
	private WebElement sortbybox;

	public WebElement getSortbybox() {
		return sortbybox;
	}
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
	
	
    
    
    
}
