package scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom.HomePage;
import pom.LoginPage;
import pom.MycoursePage;

public class ValidLogin extends Base_Test {
	@Test
	public void testcase1() throws InterruptedException
	{
		LoginPage l=new LoginPage(driver);
		Thread.sleep(9000);
		l.signinlink();
		l.usernametextbox("chethansreddy013@gmail.com");
		l.passwordtextbox("c@8970037174");
		Thread.sleep(3000);
		l.submitbutton();
		
		Thread.sleep(9000);
		
		MycoursePage  my= new MycoursePage(driver);
		my.createCourseLink();
		String data = "Artificial Intalligence";
		my.whatDoYouWantToTeachTextBox(data);
		my.enterCourseSlugeTextBox(data);
		my.createButton();
		
		
	
		
		HomePage h=new HomePage(driver);
		h.userProfileButton();
		h.logotLink();
		
			
	}

	
	
}
