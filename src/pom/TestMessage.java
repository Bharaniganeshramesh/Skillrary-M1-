package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMessage {
	static{
		   System.setProperty("webdriver.chrome.driver" , "./driver/chromedriver.exe");
		}
		
		

	public static void main(String[] args)  {
		
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://edurary.com");
		
		SignupPage s=new SignupPage(driver);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Sign Up"));
		

	}

}
