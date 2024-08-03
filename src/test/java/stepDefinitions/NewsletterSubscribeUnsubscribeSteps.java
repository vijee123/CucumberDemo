package stepDefinitions;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MyAccountPage;
import pageObjects.NewsletterPage;

public class NewsletterSubscribeUnsubscribeSteps {
	
	WebDriver driver;
	Properties p;
	MyAccountPage map;
	NewsletterPage nlp;
	
	@When("User clicks on SubscribeOrUnsubscribe link of newsletter")
	public void user_clicks_on_subscribe_or_unsubscribe_link_of_newsletter() {
		BaseClass.getLogger().info("Click on the Subscribe/Unsubscribe to newsletter link.... ");
		MyAccountPage map = new MyAccountPage(BaseClass.getDriver());
		map.clickNewsletter();	
	}
	
	
	@When("User clicks on YES radiobutton in the Newsletter page")
	public void user_clicks_on_yes_radiobutton_in_the_newsletter_page() {
		BaseClass.getLogger().info("Selecting the YES option radio button in the Newsletter page....");
		NewsletterPage nlp = new NewsletterPage(BaseClass.getDriver());
		nlp.SelectYesRadioBtn();	    
	}
	
	@Then("Yes Radio button gets selected in the Newsletter page")
	public void yes_radio_button_gets_selected_in_the_newsletter_page() {
		BaseClass.getLogger().info("Checking whether YES option radio button got Selected....");
		NewsletterPage nlp = new NewsletterPage(BaseClass.getDriver());
		boolean selected = nlp.YesRadioBtnSelected();
		Assert.assertTrue(selected);
	}
	
	@When("User clicks on NO radiobutton in the Newsletter page")
	public void user_clicks_on_no_radiobutton_in_the_newsletter_page() {
		BaseClass.getLogger().info("Selecting the NO radio button option in the Newsletter page....");
		NewsletterPage nlp = new NewsletterPage(BaseClass.getDriver());
		nlp.SelectNoRadioBtn();
	}
	
	@Then("No Radio button gets selected in the Newsletter page")
	public void no_radio_button_gets_selected_in_the_newsletter_page() {
		BaseClass.getLogger().info("Checking whether NO radio button option got Selected....");
		NewsletterPage nlp = new NewsletterPage(BaseClass.getDriver());
		boolean selected = nlp.NoRadioBtnSelected();
		Assert.assertTrue(selected);
	}

		
	@When("user clicks on the Continue Button")
	public void user_clicks_on_the_continue_button() {
		BaseClass.getLogger().info("Clicking Continue button in the Newsletter page....");
		NewsletterPage nlp = new NewsletterPage(BaseClass.getDriver());
		nlp.clickContinueBtn();
	}
	
	
	
	@Then("A success message is displayed for Newsletter Subscription update")
	public void a_success_message_is_displayed_for_newsletter_subscription() {
		BaseClass.getLogger().info("Checking the success message received for update of Newsletter Subscription....");
		NewsletterPage nlp = new NewsletterPage(BaseClass.getDriver());
		boolean MsgDisplay = nlp.newsLetterSubsSuccessMsg();
		Assert.assertTrue(MsgDisplay);
	}


}
