package stepDefinitions;

import java.time.Duration;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SearchPage;
import pageObjects.ShoppingCartPage;

public class AddToCartSteps {
	WebDriver driver;
	Properties p;
	SearchPage sp;
	ShoppingCartPage scp;
	
	@When("User clicks on Add To Cart on the product")
	public void user_clicks_on_add_to_cart_on_the_product() {
	    BaseClass.getLogger().info("Clicking on Add To Cart..........");
	    sp = new SearchPage(BaseClass.getDriver());
	    sp.clickAddToCart();
	}
	
	@Then("User gets a message for successfully adding the product into cart")
	public void user_gets_a_message_for_successfully_adding_the_product_into_cart() {
		BaseClass.getLogger().info("Check success message display on after clicking Add To Cart..........");
	    sp = new SearchPage(BaseClass.getDriver());
	    boolean success = sp.SuccessMsgDisplay();
	    Assert.assertTrue(success);
	}
	
	
	@When("User Clicks on the Shopping Cart Link")
	public void user_clicks_on_the_shopping_cart_link() {
		BaseClass.getLogger().info("Click on Shopping CartLink to navigate to Shopping Cart Page........");
	    sp = new SearchPage(BaseClass.getDriver()); 
	    sp.clickShoppingCartLink();
	}
	
	@Then("User navigates to Shopping Cart page")
	public void user_navigates_to_shopping_cart_page() {
	    scp = new ShoppingCartPage(BaseClass.getDriver());
	    boolean display = scp.shoppingCartPageDisplay();
	    Assert.assertTrue(display);
		BaseClass.getLogger().info("It got navigated to Shopping Cart Page succesfully......");
	}
	
	
	
	@Then("Selected product is successfully added in the Cart List.")
	public void selected_product_is_successfully_added_in_the_cart_list() {
	    scp = new ShoppingCartPage(BaseClass.getDriver());
	    System.out.println("The products in shopping cart are: ");
	    scp.ProdDisplayedInShoppingCartList();
	    //System.out.println(scp.ProdDisplayedInShoppingCartList());
	}
	
	
	
}
