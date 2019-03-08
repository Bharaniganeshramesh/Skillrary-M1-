package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Auto_Constant {
	public WebDriver driver;
	
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(Key,Value);
		driver=new ChromeDriver();
		driver.get("http://edurary.com/");
	}
	
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}

}
