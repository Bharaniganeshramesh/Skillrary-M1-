package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrashPage {

	@FindBy(xpath="(//div[3])/ul/li[4]/a/b")
	private WebElement  userprofiledb;
	
	
	@FindBy(linkText=" messages ")
	private WebElement messagesl;
	
	@FindBy(id="ctrash")
	private WebElement draftl;
	
	@FindBy(xpath="//ins[@class='iCheck-helper']")
	private WebElement  toggleallcb;
	
	
	// for page drop box
	
	@FindBy(name="rows")
	private WebElement pagedb;
	
   // fore sort drop box
	
	@FindBy(name="sort")
	private WebElement sortdb;
	
	// fore sort drop box
	
	@FindBy(name="order")
	private WebElement orderdb;
	
	// for go button
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-sm']")
	private WebElement gob;
	
	
	

	// for delete button
	
	@FindBy(xpath="(//i[@class='fa fa-trash-o'])[1]") 
	private WebElement  deleteb;
	
	// for next button messages
	
	@FindBy(xpath="(//i[@class='fa fa-trash-o'])[1]") 
	private WebElement  nextb;
	
	
	// for next button messages
	
    @FindBy(xpath="(//i[@class='fa fa-trash-o'])[1]") 
	private WebElement  previewb;
		
	
	
	//Constructor
	
	public TrashPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//
	
	
	
	public void userProfileDropBox()
	{
		userprofiledb.click();
		
	}

	public void messagesLink()
	{
		messagesl.click();
	}
	
	
	public void inboxLink()
	{
		draftl.click();
	}
	
	public void toggleAllcheckBox()
	{
		toggleallcb.click();
	}
	
	public void pageDropBox()
	{
		pagedb.click();
	}
	
	// for sort drop box
	
	public void sortDropBox()
	{
		sortdb.click();
	}
	
	// for sort order drop box
	
	public void orderDropBox()
	{
		orderdb.click();
	}
	
	
	// for go button
	
	public void goButton()
	{
		gob.click();
	}
	

		// for delete button
	
	public void deletebutton()
	{
	    deleteb.click();
	}
	
	

	// for next view of messages button

	public void nextButton()
	{
	    nextb.click();
	}
	

	// for preview view of messages button

	public void previewButton()
	{
	    previewb.click();
	}
	
}
