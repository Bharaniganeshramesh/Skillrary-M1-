package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AskquestionPage {
	
	public AskquestionPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//ul[@class='home_menu list-unstyled list-inline pull-right']/li/a[contains(a,questionanswer)]")
	public WebElement askquestion;
	
	@FindBy(id="askQuestionModal")
	public WebElement submittquestion;
	
	@FindBy(id="question_text")
	public WebElement questiontitleTb;
	
	@FindBy(id="category_id")
	public WebElement questoincategoryDb;
	
	@FindBy(id="sub_cats")
	public WebElement subcategoryDb;
	
	@FindBy(id="question_description")
	public WebElement discriptionTb;
	
	@FindBy(id="luploaddoc")
	public WebElement choosefile;
	
	@FindBy(id="askquestionsubmit")
	public WebElement questionsubmitt;

	@FindBy(id="search_question")
	public WebElement searchTb;
	
	@FindBy(id="search")
	public WebElement searchbutton;
	
	@FindBy(xpath="(//a[@href='http://edurary.com/questionanswer/view'])[3]")
	public WebElement allquestion;
	
	@FindBy(xpath="//a[@href='http://edurary.com/questionanswer/view?t=2']")
	public WebElement myquestion;
	
	@FindBy(xpath="//*[@id='mainwrapper']/div/div[4]/a[1]")
	public WebElement all;
	
	@FindBy(xpath="//a[@href='http://edurary.com/questionanswer/view?t=2&qt=2']")
	public WebElement answered;
	
	@FindBy(linkText=" Unanswered ")
	public WebElement  Unanswered;
	
	@FindBy(xpath="//div/button[contains(text(),'Submit Your Answer')]")
	public WebElement  submittyouranswer;
	
	@FindBy(linkText="No Answers")
	public WebElement  noanswers;
	
	public  void   askquestionbutton()
	{
		askquestion.click();
	}
	
	public  void   submittquestionbutton()
	{
		submittquestion.click();
	}
	
	public  void   questiontitletextbox(String questiontitle)
	{
		questiontitleTb.sendKeys(questiontitle);
	}
	
	public  void   questoincategorydropbox(String questoincategory)
	{
		questoincategoryDb.sendKeys(questoincategory);
	}
	
	public  void   subcategorydropbox(String subcategory)
	{
		subcategoryDb.sendKeys(subcategory);
	}
	
	public  void   discriptiontextbox(String discription)
	{
		discriptionTb.sendKeys(discription);
	}
	
	public  void   choosefilebutton()
	{
		choosefile.click();
	}
	
	
	public  void  questionsubmittbutton()
	{
		questionsubmitt.click();
	}
	
	public  void  searchtextbox(String question)
	{
		searchTb.sendKeys(question);
	}
	
	public  void  searchbutton()
	{
		searchbutton.click();
	}
	
	public  void  allquestionbutton()
	{
		allquestion.click();
	}
	public  void  myquestionbutton()
	{
		myquestion.click();
	}

	public  void allbutton()
	{
		all.click();
	}
	public  void answeredbutton()
	{
		answered.click();
	}
	
	public  void  Unansweredbutton()
	{
		 Unanswered.click();
	}
	
	public  void  submittyouranswerbutton()
	{
		submittyouranswer.click();
	}

	public  void  noanswersbutton()
	{
		noanswers.click();
	}
}
