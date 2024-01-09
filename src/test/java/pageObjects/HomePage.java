package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//-------------WebElements----------
	
	@FindBy(xpath="//span[normalize-space()='My Account']") 
	@CacheLookup 
	private WebElement myAccountLink;	
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']") 
	@CacheLookup
	private WebElement LoginLink;	

	@FindBy(xpath="//h2[normalize-space()='New Customer']")
	@CacheLookup 
	private WebElement newCustomerLabel;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	@CacheLookup
	private WebElement WarningMsg;	
	
	@FindBy(xpath="//input[@placeholder='Search']")
	@CacheLookup
	private WebElement search;	

	@FindBy(xpath="//i[@class='fa fa-search']") 
	@CacheLookup 
	private WebElement searchIcon;	

	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	@CacheLookup
	private WebElement registerLink;

	
	//---------------Actions-----------------
	
	public void clickMyAccount()
	{
		myAccountLink.click();
	}
	
	public void clickLogin()
	{
		LoginLink.click();
	}
	
	public boolean NewCustomerLblDisplay()
	{
	 boolean status = newCustomerLabel.isDisplayed();
	 return status;
	}
	
	public boolean ErrorMessageDisplay()
	{
		boolean status = WarningMsg.isDisplayed();
		return status;
	}
	
	public void setSearchProd(String prodName) {
		search.sendKeys(prodName);
	}
	
	public void clickSearchIcon() {
		searchIcon.click();
	}
	
	public void clickRegister() {
		registerLink.click();
	}
	
	public void clearSearchTextBox() {
		search.clear();
	}

}
