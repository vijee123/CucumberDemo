package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
	//----------Elements---------------
	
	@FindBy(xpath="//h1[contains(text(),'Shopping Cart')]")
	@CacheLookup 
	private WebElement shoppingCartPage;	
	
	
	List<WebElement> ProductsAddedInCart = 
			driver.findElements(By.xpath("//table[@class='table table-striped']//tr//td[@class='text-left']//a"));

	
	//------------------------Actions-------------
	
	public boolean shoppingCartPageDisplay() {
		boolean display = shoppingCartPage.isDisplayed();
		return display;
	}
	
	public  void ProdNamesAddedToCart() {
		
		int NoOfProducts = ProductsAddedInCart.size();
		System.out.println("Total no of products are: "+NoOfProducts );
		System.out.println("The products name are below:");
		for(WebElement i:ProductsAddedInCart)
		{
			String ProdName = driver.findElement(By.xpath("//table[@class='table table-striped']//tr//td[@class='text-left'//a]")).getText();
			System.out.println(ProdName);
		}
		
	}
	
}
