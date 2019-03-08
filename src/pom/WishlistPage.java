package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	
	
	@FindBy(linkText="Wishlist")
	private WebElement wishlist;
	

	@FindBy(linkText="Discover 1000s of courses in the  EduRary Marketplace.")
	private WebElement discoverl;
	
	@FindBy(linkText="Browse Course")
	private WebElement browsecoursedb;
	
	@FindBy(linkText="Engineering Tutions")
	private WebElement engineeringtutionsb;
	
	@FindBy(xpath="(//input[@name='q'])[1]")
	private WebElement searchforcoursestb;
	
	@FindBy(xpath="//*[@id='front-header']/header/div/div/div[1]/div[2]/div[2]/form/input[2]")
	private WebElement searchb;
	
	@FindBy(xpath="(//a[@class='ignorelink'])[1]")
	private WebElement askaquestionl;
	
	@FindBy(xpath="(//a[@class='ignorelink'])[2]")
	private WebElement coursesl;
	
	@FindBy(xpath="(//a[@class='ignorelink'])[3]")
	private WebElement mycoursesl;
	
	
	
	
	
    public WishlistPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    
    
    
    
    public void wishListLink()
    {
    	wishlist.click();
    }
    
    
    public void discoverLink()
    {
    	 discoverl.click();
    }
    
    
    public void browseCourseDropBox()
    {
    	browsecoursedb.click();
    }
    
    
    public void  engineeringTutionsButton()
    {
    	engineeringtutionsb.click();
    }
    
    
    public void searchForcoursesTextBox(String question)
    {
    	 searchforcoursestb.sendKeys(question);
    }
    
    
    
    public void searchButton()
    {
    	 searchb.click();
    }
    
    
    public void askAQuestionLink()
    {
    	 askaquestionl.click();
    }
    
    public void coursesLink()
    {
    	 coursesl.click();
    }
    
    public void myCoursesLink()
    {
    	 mycoursesl.click();
    }
    
    
 
}
