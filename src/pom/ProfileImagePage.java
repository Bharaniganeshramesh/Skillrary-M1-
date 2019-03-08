package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileImagePage {
	
	@FindBy(id="cImage")
	public WebElement chooseanimagefile;
	
	@FindBy(xpath="//i[@class='cropControlCrop']")
	public WebElement save;
	
	@FindBy(xpath="//i[@class='cropControlReset']")
	public WebElement reset;
	
	@FindBy(xpath="//i[@class='cropControlZoomOut']")
	public WebElement zoomout;
	
	@FindBy(xpath="//i[@class='cropControlZoomIn']")
	public WebElement zoomin;
	
	@FindBy(xpath="//*[@id='profile_delete_btn']/input")
	public WebElement changes;
	
	public ProfileImagePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public  void   chooseanimagefilebutton()
	{
		chooseanimagefile.click();
	}
	public  void   resetbutton()
	{
     	reset.click();
	}
	public  void   zoominbutton()
	{
     	zoomin.click();
	}
	public  void   zoomoutbutton()
	{
     	zoomout.click();
	}
	
	public  void   changesbutton()
	{
		changes.click();
	}
	
	
	
}
