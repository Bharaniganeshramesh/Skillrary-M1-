package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
	private static final WebElement confirmpasswordtb = null;

	@FindBy(linkText="Sign Up")
	private WebElement signupB;
	
	@FindBy(name="username")
	private WebElement usernameTB;
	
	@FindBy(name="email")
	private WebElement  emailaddressTB;
	
	@FindBy(id="password")
	private WebElement passwordTB;
	
	@FindBy(id="phone")
	private WebElement mobilenumberTB;
	
	@FindBy(name="password_confirmation")
	private WebElement confirmpasswordTB;
	
	@FindBy(xpath="//div[@class='col-sm-12']/button")
	private WebElement signupBTN;
	
	
	
	public SignupPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public  void SignupLinka()
	{
		signupB.click();
	}
	 
	

	
	public void userNameTextBox(String username)
	{
		usernameTB.sendKeys( username);
	}
	
	
	public void EmailAddressTextBox(String emailaddress)
	{
		emailaddressTB.sendKeys( emailaddress);
	}
	
	
	
	public void PasswordTextbox(String password)
	{
		passwordTB.sendKeys(password);
	}
	
	
	
	
	public void MobilenumberTextbox(String mobilenumber)
	{
		mobilenumberTB.sendKeys(mobilenumber);
	}
	
	
	
	public void ConfirmpasswordTextbox(String confirmpassword )
	{
		confirmpasswordtb.sendKeys(confirmpassword);
	}
	
	
	
	public void Signupbutton( )
	{
	 signupBTN.click();
	}
}
