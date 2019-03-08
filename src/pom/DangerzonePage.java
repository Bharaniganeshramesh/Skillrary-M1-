package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DangerzonePage {
	
	@FindBy(xpath="//li/a[contains(a,'dangerzone')]")
	private WebElement  dangerzoneB;

	@FindBy(xpath="//button[@class='btn btn-danger']")
	private WebElement  yesB;
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement  noB;

	@FindBy(xpath="//button[@class='btn alert-danger save_btn']")
	private WebElement  removeB;

	
	public DangerzonePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

	public  void  dangerzoneButton()
	{
		dangerzoneB.click();
	}
	
	public  void  removeButton()
	{
		 removeB.click();
	}
	public  void  yesButton()
	{
		 yesB.click();
	}
	public  void  noButton()
	{
		noB.click();
	}
	
	
	
	
}
	
