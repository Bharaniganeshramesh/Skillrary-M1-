package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MycoursePage {
	
	@FindBy(xpath="//a[@href='http://edurary.com/user/mycourse']")
	private WebElement mycourse;
	
	
	@FindBy(id="createcourseid")
	private WebElement createcourse;
	

	@FindBy(xpath="//a[@href='http://edurary.com/user/wishlist']")
	private WebElement wishlist;
	
	
	
	@FindBy(xpath="//a[@href='#AssignedCourse']")
	private WebElement assignedcourcel;
	
	@FindBy(xpath="//a[@href='http://edurary.com/user/learning']")
	private WebElement learning;
	
	@FindBy(id="search_question")
	private WebElement searchforcoursestb;
	
	@FindBy(id="search")
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
	
	@FindBy(id="coursename")
	private WebElement whatdoyouwanttoteachtb;
	
	@FindBy(id="coursename")
	private WebElement whatdoyouwanttoteachtb1;
	
	@FindBy(id="slug")
	private WebElement entercourseslugetb ;
	
	@FindBy(id="slug")
	private WebElement entercourseslugtb1;
	
	@FindBy(id="createcourse")
	private WebElement createb;
	
	@FindBy(xpath="//*[@id='coursecreateform']/div/div[1]/div/div[1]/div")
	private WebElement yesrb;
	
	//for once radio button
	
	@FindBy(xpath="//*[@id='coursecreateform']/div/div[3]/div[1]/div/div[1]/div/ins")
	private WebElement oncerb;
	
	@FindBy(id="coursedate")
	private WebElement whenwillthecoursestartdb;
	
	@FindBy(name="coursetime_duration")
	private WebElement durationofliveclassdb;
	
	
	@FindBy(name="courselastdate")
	private WebElement whenwilltheenrolmentclosedb;
	
	@FindBy(id="createcourse")
	private WebElement createonceb;
	
	
	
	// end of once radio button
	
	
	
	
	// for daily radio button
	
	@FindBy(xpath="//*[@id='coursecreateform']/div/div[3]/div[1]/div/div[2]/div/ins")
	private WebElement dailyrb;
	
	@FindBy(id="coursedatefrom")
	private WebElement datefromdb;
	
	@FindBy(id="coursedateto")
	private WebElement todatedb;
	
	@FindBy(id="coursetime")
	private WebElement startingtimedb;
	
	@FindBy(name="coursetime_duration")
	private WebElement durationofliveclassdb1;
	
	
	// end of daily 
	
	
	
	// for weekly radio button
	
	@FindBy(xpath="//*[@id='coursecreateform']/div/div[3]/div[1]/div/div[3]/div/ins")
	private WebElement weeklyrb;
	
	@FindBy(xpath="//*[@id='coursecreateform']/div/div[3]/div[2]/div/div[2]/div/ins")
	private WebElement weeklydayscb;
	
	// end of weekly
	
	
	// for Submit Review
	
	@FindBy(linkText="Submit Review")
	private WebElement submitreviewb;
	
	
	
	
	
    public MycoursePage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    
    
    public void mycourseLink()
    {
    	mycourse.click();
    }
    
    public void createCourseLink()
    {
    	createcourse.click();
    }
    
    public void wishListLink()
    {
    	wishlist.click();
    }
    
    public void assignedCourseLink()
    {
    	assignedcourcel.click();
    }

    public void learningLink()
    {
    	learning.click();
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
    
    public void whatDoYouWantToTeachTextBox(String data)
    {
    	whatdoyouwanttoteachtb.sendKeys(data);
    	
    }
    
    public void whatDoYouWantToTeachTextBox1()
    {
    	whatdoyouwanttoteachtb1.sendKeys(Keys.ENTER);
    }
    
    public void enterCourseSlugeTextBox(String data)
    {
    	whatdoyouwanttoteachtb.sendKeys(data);
    	
    }
    
    public void  enterCourseSlugeTextBox1()
    {
    	whatdoyouwanttoteachtb1.sendKeys(Keys.ENTER);
    }
    
    public void createButton()
    {
    	 createb.click();
    }
    
    public void yesButton()
    {
    	 yesrb.click();
    }
    
    // for once radio button
    public void onceButton()
    {
    	 oncerb.click();
    }
    
    public void  whenWillTheCourseStartDropBox()
    {
    	 whenwillthecoursestartdb.click();
    }
    
    
    public void  durationOfLiveClassDropBox()
    {
    	durationofliveclassdb.click();
    }
    
    public void  whenWillTheEnrolmentCloseDropBox()
    {
    	 whenwilltheenrolmentclosedb.click();
    }
    
    public void createOnceButton()
    {
    	 createonceb.click();
    }
    
    //end of once
    
    
    
    
    // for daily radio button
    
    public void dailyRadioButton()
    {
    	dailyrb.click();
    }
    
    public void dateFromDropBox()
    
    {
    	datefromdb.click();
    }
    
    public void toDateDropBox()
    {
    	todatedb.click();
    }
    
    
    public void startingTimeDropBox()
    {
    	startingtimedb.click();
    }
    
    
    public void durationOfLiveClassDropBox1()
    {
    	durationofliveclassdb1.click();
    }
    
    public void  whenWillTheEnrolmentCloseDropBox1()
    {
    	 whenwilltheenrolmentclosedb.click();
    }
    
    public void createOnceButton1()
    {
    	 createonceb.click();
    }
    
    
    // end of daily
    
    
    
    
    // for weekly radio button 
    
    public void weeklyRadioButton()
    {
    	weeklyrb.click();
    }
    
    public void weeklyDaysCheckBox()
    {
    	weeklydayscb.click();
    }
    
    public void dateFromDropBox2()
    {
    	datefromdb.click();
    }
    
    public void toDateDropBox2()
    {
    	todatedb.click();
    }
    
    
    public void startingTimeDropBox2()
    {
    	startingtimedb.click();
    }
    
    
    public void durationOfLiveClassDropBox2()
    {
    	durationofliveclassdb1.click();
    }
    
    public void  whenWillTheEnrolmentCloseDropBox2()
    {
    	 whenwilltheenrolmentclosedb.click();
    }
    
    public void createOnceButton2()
    {
    	 createonceb.click();
    }
    
    // end of weekly
    
    public void submitReviewButton()
    {
    	submitreviewb.click();
    }
  
    
    
    
}



