package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateRequestPage {
	@FindBy(id="level")
	public WebElement DifficultylevelDB;

	@FindBy(id="category_id")
	public WebElement categoryDB;
	
	@FindBy(id="sub_cats")
	public WebElement subcategoryDB;
	
	@FindBy(name="ccr_name")
	public WebElement titleTb;
	
	@FindBy(id="ccr_description")
	public WebElement describeyourproblmTb;
	
	@FindBy(id="luploaddoc")
	public WebElement chooseafile;
	
	@FindBy(id="s2id_autogen1")
	public WebElement skillsTb;
	
	@FindBy(xpath="(//div[@class='iradio_square-green'])[1]")
	public WebElement offlineRB;
	
	@FindBy(xpath="(//div[@class='iradio_square-green checked'])[1]")
	public WebElement liveRB;
	
	@FindBy(xpath="(//div[@class='iradio_square-green'])[2]")
	public WebElement fixedRB;
	
	@FindBy(xpath="(//div[@class='iradio_square-green checked'])[2]")
	public WebElement hourRB;
	
	@FindBy(name="budget")
	public WebElement budgetTB;
	
	@FindBy(name="submit")
	public WebElement saveB;

	
	public CreateRequestPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	

	public  void   DifficultyLevelDropbox(String level)
	{
		DifficultylevelDB.sendKeys(level);
	}
	
	public  void   categoryDropbox(String category)
	{
		categoryDB.sendKeys(category);
	}
	
	public  void   subCategorylDropbox(String subcategory)
	{
		subcategoryDB.sendKeys(subcategory);
	}
	
	public  void   titleTextbox(String title)
	{
		titleTb.sendKeys(title);
	}

	public  void   describeYourProblmTextbox(String problem)
	{
		describeyourproblmTb.sendKeys(problem);
	}
	
	public  void   chooseFileButton()
	{
		chooseafile.click();
	}
	
	public  void   skillsTextbox()
	{
		skillsTb.click();
	}
	
	public  void   offlineButton()
	{
		offlineRB.click();
	}
	
	public  void   liveButton()
	{
		liveRB.click();
	}
	
	public  void   fixedButton()
	{
		fixedRB.click();
	}
	
	public  void  hourButton()
	{
		hourRB.click();
	}
	

	public  void  budgetTextbox(String budget)
	{
		 budgetTB.sendKeys(budget);
	}
	
	public  void saveButton()
	{
		saveB.click();
	}
}
