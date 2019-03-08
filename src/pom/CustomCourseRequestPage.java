package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomCourseRequestPage {
	
	
	@FindBy(xpath="//a[@href='http://edurary.com/customcourserequest/view']")
	public WebElement coustemcourserequestL ;
	
	
	
	@FindBy(xpath="//a[@href='http://edurary.com/customcourserequest/update']")
	public WebElement CreateRequest;

	
	@FindBy(xpath="//*[@id='mainwrapper']/div/div[2]/div/div[2]/a")
	public WebElement paymenthistoryB;
	
	@FindBy(linkText=" Upcoming ")
	public WebElement UpcomingB;
	
	@FindBy(linkText=" Ongoing ")
	public WebElement  OngoingB;
	
	@FindBy(linkText=" Past ")
	public WebElement  PastB;
	
	@FindBy(linkText=" All  ")
	public WebElement  AllB;
	
	@FindBy(linkText=" Custom Course Requests  ")
	public WebElement   CustomCourseRequestsB;
	
	
	public CustomCourseRequestPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	
	public  void  customCourseRequestLink()
	{
		coustemcourserequestL.click();
	}
	
	
	
	
	public  void   CreateRequestButton()
	{
		CreateRequest.click();
	}


	public  void paymentHistoryButton()
	{
		paymenthistoryB.click();
	}
	
	public  void UpcomingButton()
	{
		UpcomingB.click();
	}
	
	public  void  OngoingButton()
	{
		 OngoingB.click();
	}
	public  void  PastButton()
	{
		PastB.click();
	}
	
	public  void  AllButton()
	{
		AllB.click();
	}
	
	public  void  CustomCourseRequestsButton()
	{
		 CustomCourseRequestsB.click();
	}
	
	
}

