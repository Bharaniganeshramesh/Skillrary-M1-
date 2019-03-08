package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationPage {
	
	@FindBy(xpath="//a[@href='http://edurary.com/user/notification']")
	private WebElement notificationl;
	
	@FindBy(xpath="//*[@id='expert_plus_main']/div/div/div/div[2]/div/form/div[1]/div/ul/li[4]/label/div/ins")
	private WebElement SkillRaryhasaspecialpromotioncb;
	
	
	@FindBy(xpath="//button[@class='btn btn-color save_btn']")
	private WebElement savechangesb;
	
	
	
	
	
	
	
	
	// constructor 
	
	public NotificationPage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	
	
	public void notificationink()
	{
		notificationl.click();
	}
	
	
	
	public void  SkillRaryHasaSpecialPromotionCheckBox()
	{
		 SkillRaryhasaspecialpromotioncb.click();
	}
	
	
	public void saveChangesButton()
	{
		savechangesb.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
