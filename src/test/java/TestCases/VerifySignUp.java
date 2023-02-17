package TestCases;

import java.io.IOException;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import PageObjectModel.LoginPageObject;
import PageObjectModel.SignUpPageObject;
import Resources.CommonMethod;
import Resources.Constants;
import Resources.baseClass;
public class VerifySignUp extends baseClass {
	@Test
     public void signup() throws IOException, InterruptedException{
		
		LoginPageObject obj=new LoginPageObject(driver);
		Thread.sleep(5000);
		obj.ClickOntryforFee().click();
		SignUpPageObject spo=new SignUpPageObject(driver);
		spo.enterFristName().sendKeys(Constants.firstname);
		spo.enterLastName().sendKeys(Constants.lastname);
		spo.enterJobTitle().sendKeys(Constants.jobtitle);
		spo.enterEmail().sendKeys(Constants.email);
		spo.enterCompany().sendKeys(Constants.company);
		spo.enterPhone().sendKeys(Constants.phone);
		
	/*	Select s=new Select(spo.selectEmployees());
		s.selectByIndex(1);
		
		Select p=new Select(spo.selectCountry());
		p.selectByIndex(1);
		*/
		
		CommonMethod.selectdropdown(spo.selectEmployees(),1);
		CommonMethod.selectdropdown(spo.selectCountry(),2);
}
}
