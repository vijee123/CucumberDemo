package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	//-------------WebElements----------------
	

	@FindBy(xpath="//h2[normalize-space()='My Account']")
	@CacheLookup 
	private WebElement MyAccMsgHeading;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	@CacheLookup
	private WebElement linkLogout;
	
		
	
	//------------------Actions-----------------------
	
	public boolean MyAccountisDisplayed()
	{
		try {
			return(MyAccMsgHeading.isDisplayed());
		}
		catch (Exception e)
		{
			return false;
		}
		
	}
	
	public void clickLogout()
	{
		linkLogout.click();
	}

}
