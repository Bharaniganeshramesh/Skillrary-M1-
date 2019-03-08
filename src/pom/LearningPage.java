package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LearningPage {
	
	
	@FindBy(xpath="//a[@href='http://edurary.com/user/learning']")
	private WebElement learning;
	
	
	@FindBy(id="mycourseFilter")
	private WebElement alldb;
	
	@FindBy(id="search_question")
	private WebElement searchforcoursestb;
	
	@FindBy(xpath="//*[@id='search']/i")
	private WebElement searchbutton;
	
	
	@FindBy(linkText="test blog")
	private WebElement testblog;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/div[2]/div/div[2]/h4/a")
	private WebElement tellmeandforgot;
	

	@FindBy(linkText="Machine Learning(Crash Course)")
	private WebElement machinelearning;
	
	@FindBy(linkText="Computer Organization(Crash Co")
	private WebElement computerorganization;
	
	@FindBy(xpath="(//div[@class='recent_sub']/../a[@class='view_more'])[1]")
	private WebElement viewmoreone;
	
	@FindBy(xpath="(//div[@class='recent_sub']/../a[@class='view_more'])[2]")
	private WebElement viewmoretwo;
	
	
	
	
	public LearningPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void learningLink()
	{
		learning.click();
	}
	
	public void allDropBox()
	{
		alldb.click();
	}
	
    public void searchForCoursesTextBox(String question)
	{
	  	 searchforcoursestb.sendKeys(question);
	    	
    }
	    
	public void searchButtonLink()
    {
	   searchbutton.click();
    }
	
    public void testBlogLink()
    {
    	testblog.click();
    }
	    
	public void tellMeAndForgotLink()
    {
	    	tellmeandforgot.click();
    }
	    
   public void machineLearningLink()
   {
	    	machinelearning.click();
	    }
	    
	    public void computerOrganizationLink()
	    {
	    	computerorganization.click();
	    }
	    
	    public void viewMoreOneLink()
	    {
	    	viewmoreone.click();
	    }
	    
	    
	    public void viewMoreTwoLink()
	    {
	    	viewmoretwo.click();
	    }
	    
	    
  
	    
}
