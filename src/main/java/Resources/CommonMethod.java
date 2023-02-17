package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethod {

	
	public static void selectdropdown(WebElement element,int index) {
		
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	public static void handlAssertions(String actual,String expected,String massege) {
		  SoftAssert a=new SoftAssert();
		     
		     String ac=actual;
		     String exp=expected;
		     a.assertEquals(ac,exp,massege);
		     a.assertAll();
	}
}
