 package pageObjects;

import java.util.ArrayList;
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
	
	@FindBy(xpath="//table[@class='table table-striped']//tr//td[@class='text-left']//a")
	@CacheLookup 
	private List<WebElement> ProductsAddedInCart;
	
//	@FindBy(xpath="//div[@class='product-thumb']//div[@class='caption']//a")
//	@CacheLookup 
//	private List<WebElement> productsLinkListed;
	
	
	
	
//	List<WebElement> ProductsAddedInCart = 
//			driver.findElements(By.xpath("//table[@class='table table-striped']//tr//td[@class='text-left']//a"));
	
//	String Prod = driver.findElement(By.xpath("//table[@class='table table-striped']//tr//td[@class='text-left']//a")).getText();
	
	

	
	//------------------------Actions-------------
	
	public boolean shoppingCartPageDisplay() {
		boolean display = shoppingCartPage.isDisplayed();
		return display;
	}
	
	
	public List<String> ProdDisplayedInShoppingCartList() {
		List<String> Products = new ArrayList<String>();
		int size = ProductsAddedInCart.size();
		System.out.println(ProductsAddedInCart);
		System.out.println("The no of webelements are: "+size);
		for(WebElement i:ProductsAddedInCart)
		{
			String Prod = i.getText();
			Products.add(Prod);
			//System.out.println(Products);
		}
		System.out.println("The Products are: "+Products);
		return Products;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public  void ProdNamesAddedToCart() {
//		
//		int NoOfProducts = ProductsAddedInCart.size();
//		System.out.println("Total no of products are: "+NoOfProducts );
//		System.out.println("The products name are below:");
//		List<String> Prod_In_List = new ArrayList<>();
//		for(WebElement i:ProductsAddedInCart)
//		{
//			String ProdName = driver.findElement(By.xpath("//table[@class='table table-striped']//tr//td[@class='text-left'//a]")).getText();
//			//System.out.println(ProdName);
//			Prod_In_List.add(ProdName);
//		}
//		
//	  System.out.println(Prod_In_List);
//	}
	
}
