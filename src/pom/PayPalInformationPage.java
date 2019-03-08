package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayPalInformationPage {
	
	@FindBy(name="p_email")
	public WebElement paypalTb;

	@FindBy(xpath="//div[@class='redactor_form-control redactor_redactor redactor_editor']")
	private WebElement billinginformationsTb;
	
	@FindBy(name="p_city")
	private WebElement cityTb;
	
	@FindBy(name="p_zip")
	private WebElement zipcodeTb;
	
	@FindBy(name="p_country")
	private WebElement countryTb;
	
	@FindBy(id="submit")
	private WebElement savechangesB;
	
	public PayPalInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public  void   paypalTextbox(String emailaddress)
	{
		paypalTb.sendKeys(emailaddress);
	}

	public  void billingInformationsTextbox(String billinginformations)
	{
		billinginformationsTb.sendKeys(billinginformations);
	}
	
	public  void cityTextbox(String city)
	{
	     cityTb.sendKeys(city);
	}
	
	public  void zipcodeTextbox(String zipcode)
	{
		zipcodeTb.sendKeys(zipcode);
	}

	public  void countryTextbox(String country)
	{
		countryTb.sendKeys(country);
	}
	
	
	public  void savechangesbutton()
	{
		savechangesB.click();
	}
	
	
}


