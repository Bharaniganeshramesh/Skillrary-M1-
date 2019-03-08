package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//*[@id='front-header']/header/div/div/div[3]/ul/li[2]/a")
	private WebElement signin;
	
	@FindBy(id="email")
	private WebElement usernameTB;
	
	@FindBy(name="password")
	private WebElement passwordTB;
	
	@FindBy(xpath="(//button)[1]")
	private WebElement submitB;
	
	@FindBy(linkText="Sign Up")
	private WebElement signup;
	
	@FindBy(xpath="//ins")
	private WebElement remembermeCB;
	
	@FindBy(linkText="Forgot Password")
	private WebElement  forgotpassword;
	
	@FindBy(xpath="(//i)[10]")
	private WebElement showpasswordIcon;
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void signinlink()
	{
		signin.click();
	}
	
	public void usernametextbox(String username)
	{
		usernameTB.sendKeys(username);
	}
	
	public void passwordtextbox(String password )
	{
		passwordTB.sendKeys(password);
	}
	
	public void submitbutton()
	{
		submitB.click();
	}
	
	public  void signuplink()
	{
		signup.click();
	}
	
	public void rememberme()
	{
		remembermeCB.click();
	}
	
	public void forgotpasswordlink()
	{
		forgotpassword.click();
	}
	public void showpasswordclick()
	{
		showpasswordIcon.click();
	}
	

}
