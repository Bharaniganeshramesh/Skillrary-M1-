package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstructorDetailsProfileInformationPage {

	@FindBy(xpath="(//li[6])[3]/a")
	private WebElement  instructordetails;

	@FindBy(name="first_name")
	private WebElement  firstnameTB;

	@FindBy(name="last_name")
	private WebElement  lastnameTB;
	
	@FindBy(name="headline")
	private WebElement headlineTB;
	
	@FindBy(name="email")
	private WebElement emailTB;

	@FindBy(xpath="//div[@class='redactor_redactor redactor_editor']")
	private WebElement biographyTB;
	
	@FindBy(xpath="//div[@class='redactor_form-control redactor_redactor redactor_editor']")
	private WebElement billinginformationsTB;
		
	@FindBy(name="b_city")
	private WebElement cityTB;
	
	@FindBy(name="b_zip")
	private WebElement zipcodeTB;
	
	@FindBy(name="b_country")
	private WebElement countryTB;
	
	@FindBy(name="b_phone")
	private WebElement telephoneTB;
	
	@FindBy(id="submit")
	private WebElement savechangesB;
	
	
	
	public InstructorDetailsProfileInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public  void instructorDetailsDutton()
	{
		instructordetails.click();
	}
	
	public  void firstNameTextbox(String firstname)
	{
		firstnameTB.sendKeys(firstname);
	}
	
	public  void lastNameTextbox(String lastname)
	{
		lastnameTB.sendKeys(lastname);
	}
	
	public  void headlineTextbox(String headline)
	{
		headlineTB.sendKeys(headline);
	}
	
	public  void emailTextbox(String email)
	{
		emailTB.sendKeys(email);
	}
	
	public  void biographyTextbox(String biography)
	{
		biographyTB.sendKeys(biography);
	}
	
	public  void billingInformationsTextbox(String billinginformations)
	{
		billinginformationsTB.sendKeys(billinginformations);
	}
	
	public  void cityTextbox(String city)
	{
	     cityTB.sendKeys(city);
	}
	
	public  void zipcodeTextbox(String zipcode)
	{
		zipcodeTB.sendKeys(zipcode);
	}

	public  void countryTextbox(String country)
	{
		countryTB.sendKeys(country);
	}
	
	public  void telephoneTextbox(String telephone)
	{
		telephoneTB.sendKeys(telephone);
	}
	
	public  void saveChangesButton()
	{
		savechangesB.click();
	}
	
	
}
