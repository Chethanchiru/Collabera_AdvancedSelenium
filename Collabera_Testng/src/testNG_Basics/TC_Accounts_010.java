package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Accounts_010 {

	/*@Test (priority= 0 , dependsOnGroups= {"SmokeTest", "AdhocTest"}) // groups is used to add the test case to an particular group.
	public void createLoan( ) {       // test cases
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}*/
	
	@Test (priority= 0 , groups= "AdhocTest") // groups is used to add the test case to an particular group.
	public void createLoan( ) {       // test cases
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.quit();
	}
}
