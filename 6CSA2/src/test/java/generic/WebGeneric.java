package generic;

import org.testng.Reporter;

public class WebGeneric extends BaseTest{
	
	public static void verifyTitle(String expectedTitle) {
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle))
			Reporter.log("homepage Displayed",true);
		else
			Reporter.log("homepage not displayed",true);
	}
	public static void verifyUrl(String expectedUrl) {
		String actualUrl = driver.getCurrentUrl();
		if(expectedUrl.equals(actualUrl))
			Reporter.log("homepage Displayed",true);
		else
			Reporter.log("homepage not displayed",true);
	}
}