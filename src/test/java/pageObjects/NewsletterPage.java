package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NewsletterPage extends BasePage {

	public NewsletterPage(WebDriver driver) {
		super(driver);
			}
	
	//---------------WebElements-----------------

	@FindBy(xpath="//input[@value='1']")
	@CacheLookup
	private WebElement YesRadioButton;
	
	@FindBy(xpath="//input[@value='0']") 
	@CacheLookup 
	private WebElement NoRadioButton;
	
	@FindBy(xpath="//input[@value='Continue']") 
	@CacheLookup 
	private WebElement ContinueButton;
	

	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
	@CacheLookup
	private WebElement successNewsletterSubscMsg;
	
	
	//------------Actions-----------------------------
	
	public void SelectYesRadioBtn() {
		YesRadioButton.click();
	}
	
	public boolean YesRadioBtnSelected() {
		boolean selected = YesRadioButton.isSelected();
		return selected;
	}
	
	public boolean NoRadioBtnSelected() {
		boolean selected = NoRadioButton.isSelected();
		return selected;
	}
	
	public void SelectNoRadioBtn() {
		NoRadioButton.click();
	}
	
	public boolean newsLetterSubsSuccessMsg() {
		boolean Display = successNewsletterSubscMsg.isDisplayed();
		return Display;
	}
	
	public void clickContinueBtn() {
		ContinueButton.click();
	}

}
