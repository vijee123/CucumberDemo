package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
		}
	
	//----------------Elements--------------
	

	@FindBy(xpath="//a[normalize-space()='Search']") 
	@CacheLookup 
	private WebElement search;
	
	@FindBy(xpath="//a[normalize-space()='iPhone']") 
	@CacheLookup 
	private WebElement iPhone;
	
	@FindBy(xpath="//span[normalize-space()='Add to Cart']")
	@CacheLookup
	private WebElement addToCart;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
	@CacheLookup 
	private WebElement addToCartSuccessMsg;
	
	@FindBy(xpath="//span[normalize-space()='Shopping Cart']")
	@CacheLookup 
	private WebElement shoppingCartLink;
	
	
	
	//------------------------Actions-----------
	
	public boolean searchPageDisplay() {
		boolean Display = search.isDisplayed();
		return Display;
	}
	
	public String getProdName() {
		String prodName = iPhone.getText();
		return prodName;
	}
	
	public void clickAddToCart() {
		addToCart.click();
	}
	
	public boolean SuccessMsgDisplay() {
		boolean status = addToCartSuccessMsg.isDisplayed();
		return status;
	}
	
	public void clickShoppingCartLink() {
		shoppingCartLink.click();
	}
	
	

}
