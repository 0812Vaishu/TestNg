package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	//This driver have not scope
		public WebDriver driver;
		private  By username=By.xpath("//input[@id='username']");
		private  By password=By.xpath("//input[@id='password']");
		private  By login=By.xpath("//input[@id='Login']");
	    private  By tryforFree=By.xpath("//a[@id='signup_link']");
		private By errormassege=By.xpath("//div[@id='error']");
	    
		public LoginPageObject(WebDriver driver2) {
			this.driver=driver2;
		}
		public WebElement enterUsernsme() {
			return driver.findElement(username);
		}
		public WebElement enterPassword() {
			return driver.findElement(password);
		}
		public WebElement ClickOnLogin() {
			return driver.findElement(login);
		}
		public WebElement ClickOntryforFee() {
			return driver.findElement(tryforFree);
		}
		public WebElement errorText() {
			return driver.findElement(errormassege);
		}
		
	}



