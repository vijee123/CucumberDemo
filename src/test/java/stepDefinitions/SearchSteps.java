package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.SearchPage;

public class SearchSteps { 
	WebDriver driver;
	Properties p;
	HomePage hp;
	SearchPage sp;
	
	@Given("User enters {string} in the search box")
	public void user_enters_in_the_search_box(String ProductName)throws IOException {
		BaseClass.getLogger().info("Enter the product name in the search text box...");
		p = BaseClass.getProperties();
	    hp = new HomePage(BaseClass.getDriver());
	    hp.setSearchProd(p.getProperty("ProductName"));
	    
	}
	
	
	@When("User clicks on the searchIcon")
	public void user_clicks_on_the_search_icon() {
	    BaseClass.getLogger().info("User clicking the search Icon......");
	    hp.clickSearchIcon();
	   
	}
	
	
	@Then("User navigates to search page")
	public void user_navigates_to_search_page() {
		sp = new SearchPage(BaseClass.getDriver());
		boolean display = sp.searchPageDisplay();
		Assert.assertTrue(display);
	    BaseClass.getLogger().info("Search page is displayed......");

	}
	
	@Then("Any products if displayed should include product name searched for.")
	public void any_products_if_displayed_should_include_product_name_searched_for() {
	    BaseClass.getLogger().info("Check for name of products displayed......");
	    sp =new SearchPage(BaseClass.getDriver());
	    String prod = sp.getProdName();
	    Assert.assertEquals(prod,"iPhone");
	    }
	

}
