package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StarredPage {
	
	
	@FindBy(xpath="(//div[3])/ul/li[4]/a/b")
	private WebElement  userprofiledb;
	
	
	@FindBy(linkText=" messages ")
	private WebElement messagesl;
	
	@FindBy(id="cstar")
	private WebElement starredl;
	
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
	
	// FOR apply label pop up

	
	@FindBy(id="dropdownMenu2")
	private WebElement applylabelp ;
	
	
	// for remove label pop up
	
	@FindBy(xpath="//i[@class='fa fa-ban']")
	private WebElement  removelabelp;
	
	

	// for delete button
	
	@FindBy(xpath="(//i[@class='fa fa-trash-o'])[1]") 
	private WebElement  deleteb;
	
	
	
	
	//Constructor
	
	public StarredPage(WebDriver driver)
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
		starredl.click();
	}
	
	public void toggleAllCheckBox()
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
	

	// for apply label pop up
	
	public void applyLabelPopup()
	{
		applylabelp.click();
	}

	// for apply label pop up
	
	public void removeLabelPopup()
	{
	    removelabelp.click();
	}
	
	// for delete button
	
	public void deleteButton()
	{
	    deleteb.click();
	}					
				
				
				
				

}
