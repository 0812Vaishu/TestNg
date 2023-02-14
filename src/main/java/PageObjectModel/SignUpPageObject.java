package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {
	
	
	public WebDriver driver;
	
	private  By firstName=By.xpath("//input[@name='UserFirstName']");
	private  By lastName=By.xpath("//input[@name='UserLastName']");
	private  By Email=By.xpath("//input[@name='UserEmail']");
    private  By jobTitle=By.xpath("//input[@name='UserTitle']");
    private  By company=By.xpath("//input[@name='CompanyName']");
    private  By employees=By.xpath("//select[@name='CompanyEmployees']");
    private  By phone=By.xpath("//input[@name='UserPhone']");
    private  By country=By.xpath("//select[@name='CompanyCountry']");
    private By state=By.xpath("//select[@name='CompnyState']");
    private  By iagree=By.xpath("(//div[@class='chekbox-ui'])[1]");
    private  By startMyFreeTrial=By.xpath("//button[@name='start my free trial']");
    
	public SignUpPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement enterFristName() {
    	return driver.findElement(firstName);
    }
    public WebElement enterLastName() {
    	return driver.findElement(lastName);
    }
    public WebElement enterEmail() {
    	return driver.findElement(Email);
    }
    public WebElement enterJobTitle() {
    	return driver.findElement(jobTitle);
    }
    public WebElement selectEmployees() {
	    return driver.findElement(employees);
    }
    public WebElement selectCountry() {
	    return driver.findElement(country);
    }
    public WebElement enterCompany() {
	    return driver.findElement(company);
    }
    public WebElement enterPhone() {
	    return driver.findElement(phone);
    }
    public WebElement ClickOnIagree() {
	    return driver.findElement(iagree);
    }
    public WebElement ClickOnStartmyFreeTrial() {
	    return driver.findElement(startMyFreeTrial);
    }
}
