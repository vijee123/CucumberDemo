package stepDefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Factory.BaseClass;
import Utilities.DataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccountCreatedPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class LoginSteps {
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	MyAccountPage accPage;
	AccountCreatedPage acp;
	Properties p;
	List<HashMap<String, String>> datamap;
	
		
	@Given("User navigates to the Login Page.")
	public void user_navigates_to_the_login_page() throws InterruptedException {
		 BaseClass.getLogger().info("Go to MyAccount and click Login....");
		   hp = new HomePage(BaseClass.getDriver());
		   hp.clickMyAccount();
		   hp.clickLogin();
		 BaseClass.getLogger().info("Login Page Opened....");
		   
	}
	
	
	@When("User provides valid {string} and {string}")
	public void user_provides_valid_and(String email, String passwd) throws IOException {
		 BaseClass.getLogger().info("Enter your username and password details at Login page....");
		 p=BaseClass.getProperties();
		 lp = new LoginPage(BaseClass.getDriver());
		 lp.setEmail(email);
		 lp.setPassword(passwd);
//		 lp.setEmail(p.getProperty("email"));
//		 lp.setPassword(p.getProperty("password"));
		 
	}
	
	
	@When("User click the Login button")
	public void user_click_the_login_button() {
		 lp.clickLogin();
		 BaseClass.getLogger().info("Clicked on Login Button....");
	}
	
	
	@Then("User navigates to the MyAccount page")
	public void user_navigates_to_the_my_account_page() {
		accPage = new MyAccountPage(BaseClass.getDriver());
		boolean display = accPage.MyAccountisDisplayed();
		Assert.assertTrue(display);
	}
	

	@Then("User navigates to My Account Page when they enter username and password from excel row {string}")
	public void user_navigates_to_my_account_page_when_they_enter_username_and_password_from_excel_row(String rows) {
	    
		datamap = DataReader.data(System.getProperty("user.dir")+"\\testData\\OpenCart_LoginData.xlsx", "Sheet1");
		
		int row_index = Integer.parseInt(rows)-1;
		
		String email = datamap.get(row_index).get("username");
		String password = datamap.get(row_index).get("password");
		String exp_res = datamap.get(row_index).get("res");
		System.out.println(email+"  "+password+" "+exp_res);
		
		lp = new LoginPage(BaseClass.getDriver());
		lp.setEmail(email);
		lp.setPassword(password);
		lp.clickLogin();
		
		accPage = new MyAccountPage(BaseClass.getDriver());
		
		
		try {
			boolean display = accPage.MyAccountisDisplayed();
			System.out.println(display);
		if(exp_res.equals("Valid"))
		{
			if(display==true)
			{
				//MyAccountPage myacc = new MyAccountPage(BaseClass.getDriver());
				accPage.clickLogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		
		if(exp_res.equals("Invalid"))
		{
			if(display==true)
			{
				accPage.clickLogout();
				Assert.assertTrue(false);
				
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
		}
		catch(Exception e)
		{
			Assert.assertTrue(false);
		}
		
	}
			
	
	
	@When("User provides invalid {string} and invalid {string}")
	public void user_provides_invalid_and_invalid(String string, String string2) throws IOException {
		 BaseClass.getLogger().info("Enter your username and password details at Login page....");
		 p=BaseClass.getProperties();
		 lp = new LoginPage(BaseClass.getDriver());
		 lp.setEmail(p.getProperty("email"));
		 lp.setPassword(p.getProperty("password1"));
	}
	
	
	@Then("User should remain in the Login page")
	public void user_should_remain_in_the_login_page() {
		hp = new HomePage(BaseClass.getDriver());
		boolean display = hp.NewCustomerLblDisplay();
		Assert.assertTrue(display);
	}
	
	
	@Then("User should get an error message.")
	public void user_should_get_an_error_message() {
		hp = new HomePage(BaseClass.getDriver());
		boolean display = hp.ErrorMessageDisplay();
		Assert.assertTrue(display);
	}


	
}
