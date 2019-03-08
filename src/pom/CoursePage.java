package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage {
	
@FindBy(xpath="//a[@href='http://edurary.com/course']")
private WebElement course;

@FindBy(xpath="//ul[@class='home_menu list-unstyled list-inline pull-right']/li/a[contains(a,'questionanswer')]")
private WebElement askaquestionl;

@FindBy(xpath="//a[@href='http://edurary.com/user/mycourse']")
private WebElement mycourse;

@FindBy(name="q")
private WebElement searchforcourseTB;

@FindBy(xpath="//div[@class='dropdown open']")
private WebElement browsecourseDB;

@FindBy(xpath="//ul/li/a[contains(a,'design')]")
private WebElement designs;

@FindBy(xpath="//ul/li/a[contains(a,'engineering-tutions')]")
private WebElement  engineeringtutions;

@FindBy(xpath="//ul/li/a[contains(a,'soft-skills')]")
private WebElement  softskills;

@FindBy(xpath="//ul/li/a[contains(a,'technology')]")
private WebElement  technology;

@FindBy(xpath="//*[@id='page-wrapper-full']/div/div/div[2]/div/div/div[1]/div/div[2]/ul/li[1]/a")
private WebElement  free;

@FindBy(xpath="//*[@id='page-wrapper-full']/div/div/div[2]/div/div/div[1]/div/div[2]/ul/li[2]/a")
private WebElement  lessthaninr50;

@FindBy(xpath="//*[@id='page-wrapper-full']/div/div/div[2]/div/div/div[1]/div/div[2]/ul/li[2]/a")
private WebElement  inr10inr199;

@FindBy(xpath="//*[@id='page-wrapper-full']/div/div/div[2]/div/div/div[1]/div/div[3]/ul/li[1]/a")
private WebElement  appropriateforall;

@FindBy(xpath="//*[@id='page-wrapper-full1]/div/div/div[2]/div/div/div[1]/div/div[3]/ul/li[2]/a")
private WebElement  beginner;

@FindBy(xpath="//*[@id='page-wrapper-full1]/div/div/div[2]/div/div/div[1]/div/div[3]/ul/li[2]/a")
private WebElement  intermedia;

@FindBy(xpath="//*[@id='page-wrapper-full']/div/div/div[2]/div/div/div[1]/div/div[4]/ul/li[1]/a")
private WebElement  feature;

@FindBy(xpath="//*[@id='page-wrapper-full']/div/div/div[2]/div/div/div[1]/div/div[4]/ul/li[2]/a")
private WebElement  freecourses;

@FindBy(xpath="//*[@id='page-wrapper-full']/div/div/div[2]/div/div/div[1]/div/div[4]/ul/li[3]/a")
private WebElement  toprateing;

@FindBy(xpath="//*[@id='page-wrapper-full']/div/div/div[2]/div/div/div[1]/div/div[4]/ul/li[4]/a")
private WebElement  topfree;

@FindBy(xpath="//*[@id='page-wrapper-full']/div/div/div[2]/div/div/div[1]/div/div[4]/ul/li[5]/a")
private WebElement  toppaid;

@FindBy(xpath="//*[@id='page-wrapper-full']/div/div/div[2]/div/div/div[1]/div/div[4]/ul/li[6]/a")
private WebElement  mostviewed;

@FindBy(xpath="(//div[@class='view_block'])[1]/a")
private WebElement viewall;

@FindBy(xpath="(//div[@class='owl-buttons'])/div[1]")
private WebElement previousB;

@FindBy(xpath="(//div[@class='owl-buttons'])/div[2]")
private WebElement forwordB;

@FindBy(xpath="(//li/ul[@class='dropdown-menu']/li/a[@class='ignorelink'])[1]")
private WebElement messageB;

@FindBy(xpath="(//li/ul[@class='dropdown-menu']/li/a[contains(a,profile)])[2]")
private WebElement profileB;

@FindBy(xpath="//li/ul/li[4]/a")
private WebElement creditsusdB;

@FindBy(xpath="//li/ul/li[5]/a")
private WebElement profilesettingB;

@FindBy(xpath="//li/ul/li[6]/a")
private WebElement customchangesrequestB;

@FindBy(xpath="//li/ul/li[8]/a[contains(a,'logout')]")
private WebElement logoutB;

@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/a")
private WebElement viewmore;






@FindBy(linkText="test blog")
private WebElement testblog;

@FindBy(linkText="Machine Learning(Crash Course) 7th Semester")
private WebElement machinelearing;

@FindBy(linkText="“Tell me and I forget. Teach me and I remember. Involve me and I learn” - Benjamin Franklin")
private WebElement tellmeanditext;




public CoursePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void CourseLinkText()
{
	course.click();
}
public  void   askquestionButton()
{
	askaquestionl.click();
}
public  void   mycourseButton()
{
	mycourse.click();
}

public  void  searchForCourseTextbox(String courses)
{
	searchforcourseTB.sendKeys(courses);
}

public  void   browseCourseButton()
{
	 browsecourseDB.click();
}



public void designsLink()
{
	designs.click();
}

public void engineeringTutionsLink()
{
	engineeringtutions.click();
}

public void softskillsLink()
{
	softskills.click();
}

public void technologyLink()
{
	technology.click();
}


public void freeLink()
{
	free.click();
}


public void lessthaninr50Link()
{
	lessthaninr50.click();
}

public void inr10inr199Link()
{
	inr10inr199.click();
}

public void appropriateForAllLink()
{
	appropriateforall.click();	
}

public void beginnerLink()
{
	beginner.click();	
}


public void intermediaLink()
{
	 intermedia.click();	
}

public void featureLink()
{
	feature.click();
	
}

public void freeCoursesLink()
{
	freecourses.click();
}

public void topRateingLink()
{
	toprateing.click();
}

public void topFreeLink()
{
	topfree.click();
}

public void toppaidLink()
{
	toppaid.click();
}

public void mostViewedLink()
{
	mostviewed.click();
}

public void viewAllButton()
{
	viewall.click();
}

public void previousButton()
{
   previousB.click();
}

public void forwordButton()
{
	forwordB.click();
}

public void messageBbutton()
{
	messageB.click();
}

public void profileButton()
{
	profileB.click();
}

public void creditsUsdButton()
{
	creditsusdB.click();
}

public void profileSettingButton()
{
	profilesettingB.click();
}

public void customChangesRequestButton()
{
	customchangesrequestB.click();
}
public void logoutButton()
{
	logoutB.click();
}



public void testblogLink()
{
	testblog.click();
}

public void machineLearnigBook()
{
	machinelearing.click();
}
 public void tellmeandifrog()
 {
	 tellmeanditext.click();
 }
 
 public void viewMoreText()
 {
	 viewmore.click();
 }

}