package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountRegisterPage extends BasePage{
	
	public AccountRegisterPage(WebDriver driver) {
		super(driver);
	}
	
	//-----------------WebElements----------------------


	@FindBy(xpath="//input[@id='input-firstname']") 
	@CacheLookup
	private WebElement firstName;	
	
	@FindBy(xpath="//input[@id='input-lastname']")
	@CacheLookup
	private WebElement lastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	@CacheLookup
	private WebElement eMail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	@CacheLookup 
	private WebElement telephone;
	
	@FindBy(xpath="//input[@id='input-password']") 
	@CacheLookup
	private WebElement password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	@CacheLookup 
	private WebElement passwordConfirm;
	
	@FindBy(xpath="//input[@name='agree']")
	@CacheLookup
	private WebElement agreeChkbox;
	
	@FindBy(xpath="//input[@value='Continue']")
	@CacheLookup 
	private WebElement BtnContinue;
	
	//--------------Actions-----------------------
	
	public void setFirstName(String fName) {
		firstName.sendKeys(fName);
	}
	
	public void setLastName(String lName) {
		lastName.sendKeys(lName);
	}
	
	public void setEmail(String email) {
		eMail.sendKeys(email);
	}
	
	public void setTelephone(String phone) {
		telephone.sendKeys(phone);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void setConfirmPwd(String pwd) {
		passwordConfirm.sendKeys(pwd);
	}
	
	
	public void clickAgree() {
		agreeChkbox.click();
	}
	
	public void clickContinue() {
		BtnContinue.click();
	}
	
	
}
