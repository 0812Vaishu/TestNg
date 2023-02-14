package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.CommonMethod;
import Resources.Constants;
import Resources.baseClass;

public class VerifyLogin extends baseClass {

	SoftAssert a=new SoftAssert();
	@Test(dataProvider = "testData")
	public void login(String username, String password) throws IOException {

		LoginPageObject obj = new LoginPageObject(driver);
		
		CommonMethod.handlAssertions(driver.getCurrentUrl(),"https://login.salesforc.com/","url is not matching");
		obj.enterUsernsme().sendKeys(username);
		obj.enterPassword().sendKeys(password);
		obj.ClickOnLogin().click();

   CommonMethod.selectAssertions(obj.errorText().getText(),Constants.expectedErrorMassege,"Error messege is not matching");

	}

	@DataProvider
	public Object[][] testData() {
		Object[][] data = new Object[2][2];
		data[0][0] = Constants.username12;
		data[0][1] = Constants.password12;
		data[1][0] = Constants.username21;
		data[1][1] = Constants.password21;
		return data;
	}

}
