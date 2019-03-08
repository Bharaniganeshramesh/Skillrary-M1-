package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
 @FindBy(linkText="Forgot Password")
 private WebElement  forgotpassword;
 
 @FindBy(name="credit_email")
 private WebElement  emailaddressTB;
 
 
 @FindBy(xpath="//button[@class='btn btn-color animated fadeInLeft']")
 private WebElement submittBTN;
 
 @FindBy(linkText="Return to login page")
 private WebElement returnloginpage;
 
 public ForgotPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
 

	public  void forgotpasswordLink()
	{
		forgotpassword.click();
	}
 
	public  void emailaddressTextbox(String email)
	{
		emailaddressTB.sendKeys(email);
	}
	
	public  void submitButton()
	{
		submittBTN.click();
	}
	
	public  void returnToLoginPageLink()
	{
		returnloginpage.click();
	}
	
	

	
}
