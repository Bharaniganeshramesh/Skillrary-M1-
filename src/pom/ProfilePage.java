package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	@FindBy(xpath="//*[@id='expert_plus_main']/div/div/div/div[1]/div/div/ul/li[1]/a")
	private WebElement  profile;
	
	@FindBy(name="designation")
	private WebElement designationTb;
	
	@FindBy(id="headline")
	private WebElement headlineTb;
	
	@FindBy(name="first_name")
	private WebElement firstnameTb;
	
	@FindBy(name="username")
	private WebElement usernameTb;
	
	@FindBy(name="last_name")
	private WebElement lastnameTb;
	
	@FindBy(id="phone")
	private WebElement mobaileTb;
	
	@FindBy(id="countries_states")
	private WebElement countryTb;
	
	@FindBy(id="state")
	private WebElement stateTb;
	
	@FindBy(name="city")
	private WebElement cityTb;
	
	@FindBy(id="student_type")
	private WebElement professionTb;
	
	@FindBy(name="dob")
	private WebElement dateofbirthTb;
	
	@FindBy(id="course_title")
	private WebElement coursetitleTb;
	
	@FindBy(name="university")
	private WebElement universityTb;
	
	@FindBy(name="college")
	private WebElement collegeTb;
	
	@FindBy(name="semester")
	private WebElement semesterTb;
	
	@FindBy(xpath="//*[@id='profileForm']/div[15]/div/div[3]/div[2]")
	private WebElement biographyTb;
	
	@FindBy(name="lang")
	private WebElement languageDb;
	
	@FindBy(name="currency")
	private WebElement selectcurrencyDb;
	
	@FindBy(xpath="//*[@id='expert_plus_main']/div/div/div/div[2]/div/div[3]/button")
	private WebElement savechanges;
	
	@FindBy(name="link_web")
	private WebElement weblinksTb;
	
	@FindBy(name="link_google_plus")
	private WebElement googlelinksTb;
	
	@FindBy(name="link_twitter")
	private WebElement twitterlinksTb;
	
	@FindBy(name="link_facebook")
	private WebElement facebooklinksTb;
	
	@FindBy(name="link_linkedin")
	private WebElement linkedinlinksTb;
	
	@FindBy(name="link_youtube")
	private WebElement youtubelinksTb;
	
	@FindBy(id="headline_count")
	private WebElement headlinecountB;
	
	
	@FindBy(xpath="//*[@id='profileForm']/div[6]/div/div/div")
	private WebElement countrycodeB;
	
	
	public ProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public  void signupLink()
	{
		profile.click();
	}

	
	public  void designationTextbox(String designation)
	{
		designationTb.sendKeys( designation);
	}
	

	public  void headLineTextbox( String headline)
	{
		headlineTb.sendKeys(headline);
	}
	

	public  void firstNameTextbox(String firstname)
	{
		firstnameTb.sendKeys(firstname);
	}
	public  void lastNameTextbox(String lastname)
	{
		lastnameTb.sendKeys(lastname);
	}
	
	public  void usernameTextbox(String username)
	{
		usernameTb.sendKeys(username);
	}
	public  void mobaileTextbox(String mobaile)
	{
		mobaileTb.sendKeys(mobaile);
	}
	
	public  void countryDropbox(String country)
	{
	     countryTb.sendKeys(country);
	}
	
	public  void stateDropbox(String state)
	{
	     stateTb.sendKeys(state);
	}
	
	public  void cityTextbox(String city)
	{
	     cityTb.sendKeys(city);
	}
	
	public  void dateOfBirthTextbox(String dob)
	{
		dateofbirthTb.sendKeys(dob);
	}
	
	public  void  professionTextbox(String profession)
	{
		 professionTb.sendKeys(profession);
	}
	
	public  void courseTitleTextbox(String coursetitle)
	{
		coursetitleTb.sendKeys(coursetitle);
	}
	
	public  void universityTextbox(String university)
	{
		universityTb.sendKeys(university);
	}
	
	public  void collegeTextbox(String college)
	{
		collegeTb.sendKeys(college);
	}

	public  void semesterTextbox(String semester)
	{
		semesterTb.sendKeys(semester);
	}
	
	public  void biographyTextbox(String biography)
	{
		biographyTb.sendKeys(biography);
	}
	
	
	public  void languageTextbox(String language)
	{
		languageDb.sendKeys(language);
	}
	
	public  void selectCurrencyDropbox(String currency)
	{
		selectcurrencyDb.sendKeys(currency);
	}
	
	public  void  saveChangesButton()
	{
		 savechanges.click();
	}
	
	public  void  webLinksTextbox(String weblink)
	{
		weblinksTb.sendKeys(weblink);
	}
	
	
	public  void  googleLinksTextbox(String googlelink)
	{
		googlelinksTb.sendKeys(googlelink);
	}
	
	public  void   twitterLinksTextbox(String  twitterlink)
	{
		 twitterlinksTb.sendKeys( twitterlink);
	}
	
	public  void   facebookLinksTextbox(String facebooklink)
	{
		facebooklinksTb.sendKeys( facebooklink);
	}
	public  void   linkedinLinksYextbox(String linkedinlink)
	{
		linkedinlinksTb.sendKeys( linkedinlink);
	}
	
	public  void   youtubeLinksTextbox(String youtubelink)
	{
		youtubelinksTb.sendKeys( youtubelink);
	}
	
	public  void   headlineCountbox()
	{
		headlineTb.getSize();
	}
	
	public  void   countryCodebox()
	{
		countrycodeB.click();
	}
	
}



