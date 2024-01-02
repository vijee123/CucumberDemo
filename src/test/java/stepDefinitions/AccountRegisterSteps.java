package stepDefinitions;

import java.util.Map;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import pageObjects.AccountCreatedPage;
import pageObjects.AccountRegisterPage;
import pageObjects.HomePage;

public class AccountRegisterSteps {
	
	WebDriver driver;
	Properties p;	
	HomePage hp;
	AccountRegisterPage arp;
	AccountCreatedPage acp;
	
	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
	   BaseClass.getLogger().info("Navigating to the Account Register Page....");
	   hp = new HomePage(BaseClass.getDriver());
	   hp.clickMyAccount();
	   hp.clickRegister();
	}
	
	
	@Given("User provides all required details")
	public void user_provides_all_required_details(DataTable dataTable) {
		Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
		
		BaseClass.getLogger().info("Enter all the details in the Account Registeration Page...");
		arp = new AccountRegisterPage(BaseClass.getDriver());
		arp.setFirstName(dataMap.get("FirstName"));
		arp.setLastName(dataMap.get("LastName"));
		String email = BaseClass.randomAlphaNumeric().concat("@gmail.com");
		//arp.setEmail(email);
		//System.out.println(email);
		arp.setEmail(BaseClass.randomAlphaNumeric()+"@gmail.com");
		arp.setTelephone(dataMap.get("Telephone"));
		arp.setPassword(dataMap.get("Password"));
		arp.setConfirmPwd(dataMap.get("Password"));				
	}
	
	
	@Given("User clicks on the private policy check box")
	public void user_clicks_on_the_private_policy_check_box() {
	    BaseClass.getLogger().info("User clicks the private policy check box...");
	    arp = new AccountRegisterPage(BaseClass.getDriver());
	    arp.clickAgree();
	   	}
	
	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
		 BaseClass.getLogger().info("User clicks the Continue Button...");
		    arp = new AccountRegisterPage(BaseClass.getDriver());
		    arp.clickContinue();
	}
	
	
	@Then("User account gets created successfully.")
	public void user_account_gets_created_successfully() {
		 BaseClass.getLogger().info("Verify the Account created message...");
		 acp = new AccountCreatedPage(BaseClass.getDriver());
		 boolean display = acp.AccCreatedDisplay();
		 Assert.assertTrue(display);		 
	}



}
