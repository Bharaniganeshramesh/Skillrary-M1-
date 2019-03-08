package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	

	@FindBy(linkText="Course")
	private WebElement course;
	
	
	@FindBy(linkText="Sign In")
	private WebElement signin;
	
	
	@FindBy(linkText="Sign Up")
	private WebElement signup;
	
	
	@FindBy(linkText=" BECOME A MEMBER")
	private WebElement  becomeamember;
	
	
	@FindBy(xpath="//*[@id='front-header']/header/div/div/div[3]/ul/li[4]/a")
	private WebElement  userprofileButton;
	
	@FindBy(xpath="//*[@id='front-header']/header/div/div/div[3]/ul/li[4]/ul/li[8]/a")
	private WebElement  logoutL;
	
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	public  void courseLink()
	{
		course.click();
	}
	
	
	public void signInLink()
	{
		signin.click();
	}
	
	
	public void signUpLink()
	{
		signup.click();
	}
	
	
	public void BecomeAMember()
	{
		becomeamember.click();
	}
	
	
	public void userProfileButton()
	{
		userprofileButton.click();
	}
	
	
	public void logotLink()
	{
		logoutL.click();
	}
	
	
	
	

}
