package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	@FindBy(xpath="(//ul/li)[@class='active']/a[ contains(a,'account')]")
	private WebElement  accountB;

	@FindBy(id="email")
	private WebElement  changeyouremailTB;

	
	@FindBy(id="email_password")
	private WebElement  pleseenteryourpasswordTB;

	@FindBy(xpath="//div[@class='modal-footer']/input")
	private WebElement saveB;
	
	@FindBy(xpath="//div[@class='modal-header']/button")
	private WebElement cancelB;
	
	@FindBy(xpath="//div[@class='email_edit']/p")
	private WebElement emailTB;
	
	@FindBy(xpath="//i[@class='fa fa-edit']")
	private WebElement edit;
	
	@FindBy(name="current_password")
	private WebElement  passwordTB;
	
	@FindBy(id="password")
	private WebElement  enternewpasswordTb;
	
	@FindBy(name="password_confirmation")
	private WebElement  retypenewpasswordTB;
	
	@FindBy(xpath="//div[@class='button_footer']/button")
	private WebElement  savepasswordB;
	
	public AccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public  void   AccountButton()
	{
		accountB.click();
	}
		
	public  void    ChangeYourEmailTextbox(String email)
	{
		 changeyouremailTB.sendKeys(email);
	}
	
	
	public  void    PleseEnterYourPasswordTextbox(String password)
	{
		pleseenteryourpasswordTB.sendKeys(password);
	}
	
	public  void  SaveButton()
	{
		saveB.click();
	}
	
	public  void  CancelButton()
	{
		 cancelB.click();
	}
	
	public  void    Emailtextbox(String email)
	{
		emailTB.sendKeys( email);
	}
	

	public  void  EditButton()
	{
		 edit.click();
	}
	
	public  void    PasswordTextbox(String password)
	{
		passwordTB.sendKeys(password);
	}
	
	public  void    EnterNewPasswordTextbox(String newpassword)
	{
		enternewpasswordTb.sendKeys(newpassword);
	}
	
	public  void     RetypeNewPasswordTextbox(String retypepassword)
	{
		 retypenewpasswordTB.sendKeys(retypepassword);
	}
	
	public  void  SavepasswordButton()
	{
		 savepasswordB.click();
	}
	
}




