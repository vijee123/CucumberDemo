package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage{
	
	public AccountCreatedPage(WebDriver driver) {
		super(driver);
	}
	
	//---------------WebElements----------------

	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") 
	@CacheLookup
	private WebElement yourAccountHasBeenCreated;
	
	//----------------Actions-----------------------
	
	public boolean AccCreatedDisplay() {
		
		boolean display = yourAccountHasBeenCreated.isDisplayed();
		return display;
	}
	
	

}
