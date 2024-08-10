package UnitTestAssignment;


import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestScript extends BaseClass
{
    @Test
    public void book()
    {
    	HomePage book=new HomePage(driver);
    	book.getBooksLink().click();
    	book.getSortbybox().click();
    	
    	Select listbox=new Select(book.getSortbybox());
    	listbox.selectByIndex(1);
    	
    }
}
