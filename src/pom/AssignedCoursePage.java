package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignedCoursePage {
	
	@FindBy(xpath="//a[@href='#AssignedCourse']")
	private WebElement assignedcourcel;
	
	@FindBy(linkText="Discover 1000s of courses in the  EduRary Marketplace.")
	private WebElement discoverl;
	
	// this is for ask questions , courses and my courses
	
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
	
	
	
	
	// it is for user profile drop box
	
	@FindBy(xpath="(//div[3])/ul/li[4]/a/b")
	private WebElement userprofiledb;
	
	
	
	
	
	
	
	//constructor of assigned page
	
	public  AssignedCoursePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	
	
	// to go to assigned page
	
	
	public void assignedCourseLink()
	{
		assignedcourcel.click();
	}
	
	
	 public void discoverLink()
     {
	    discoverl.click();
	 }
	 
	 
	 //
	 
	 
	 public void browseCourseDropBox()
	    {
	    	browsecoursedb.click();
	    }
	    
	    
	    public void  engineeringTutionsButton()
	    {
	    	engineeringtutionsb.click();
	    }
	    
	    
	    public void searchForCoursesTextBox(String question)
	    {
	    	 searchforcoursestb.sendKeys(question);
	    }
	    
	    
	    
	    public void searchButton()
	    {
	    	 searchb.click();
	    }
	    
	    
	    public void askQuestionLink()
	    {
	    	 askaquestionl.click();
	    }
	    
	    public void coursesLink()
	    {
	    	 coursesl.click();
	    }
	    
	    public void mycoursesLink()
	    {
	    	 mycoursesl.click();
	    }
	 
	
	// for user profile 
	
	public void userProfileBropBox()
	{
		userprofiledb.click();
	}
	
	
	
	
	
	

}
