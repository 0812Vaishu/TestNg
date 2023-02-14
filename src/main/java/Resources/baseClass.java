package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class baseClass {

	public Properties prop;
	public WebDriver driver;

	public void driverInitilize() throws IOException {

		// this will read the properties file--
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");

		// access the properties file--
		prop = new Properties();
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// driver=new firefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			// firefox code
		} else {
			System.out.println("please make sure you have correct browser");
		}
	}

	@BeforeMethod
	public void openurl() throws IOException {
		driverInitilize();
		// This driver have scope
		String urlName = prop.getProperty("url");
		driver.get(urlName);
	}

	@AfterMethod
	public void quitbrowser() throws IOException {
		driver.quit();
	}
}
