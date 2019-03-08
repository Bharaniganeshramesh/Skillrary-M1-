package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailesPage {
	
	@FindBy(xpath="//span[@class='text-info']")
	private WebElement detailesl;
	
	
	@FindBy(xpath="//body[@id='tinymce']/p")
	private WebElement coursesummarytb ;
	
	
	@FindBy(id="course_goal")
	private WebElement coursegoaltb ;

    
	@FindBy(id="course_goal_btn")
	private WebElement  coursegoaladdb ;
	
	
	@FindBy(id="int_audience")
	private WebElement intendedaudiencetb;
	
	
	@FindBy(id="int_audience_btn")
	private WebElement intendedaudienceaddb;
	
	
	@FindBy(id="course_req")
	private WebElement courserequirementstb;
	
	
	@FindBy(id="course_req_btn")
	private WebElement courserequirementsaddb;
	
	
	@FindBy(xpath="(//ins)")
	private WebElement  instructionlevelrb ;
	
	
	@FindBy(xpath="(//ins)[5]")
	private WebElement  admindiscountcb ;
	
	
	@FindBy(xpath="(//input[@type='submit'])[3]")
	private WebElement  saveb ;
	
	// constructor  

	
	
	public DetailesPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
		
	}
	
	
	//
	
	// 
	
	public void detailesLink()
	{
		
		detailesl.click();
	}
	
	
	
	public void courseSummaryTextBox(String data) 
	{
		coursesummarytb.sendKeys(data); 	
	}
	
	
	public void courseGoalTextBox(String data)
	{
		 coursegoaltb.sendKeys(data);
	}
	
	
	public void courseGoalAddButton()
	{
		coursegoaladdb.click();
	}
	
	
	public void intendedAudienceTextBox(String data)
	{
		 intendedaudiencetb.sendKeys(data);
	}
	
	public void intendedAudienceAddbutton()
	{
		intendedaudienceaddb.click();
	}
	
	public void courseRequirmentsTextBox(String data)
	{
		courserequirementstb.sendKeys(data);
	}
	
	
	public void courseRequirmentsAddButton(String data)
	{
		courserequirementsaddb.sendKeys(data);
	}
	
	
	public void instructionLevelRadioButton()
	{
		instructionlevelrb.click();
	}
	
	
	public void adminDiscountCheckBox()
	{
		admindiscountcb.click();
	}
	
	
	public void saveButton()
	{
		saveb.click();
	}
	
	
	
	
	
	
	
}
