package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Accounts_007 { // groups is used to add the test case to a particular group and it will accept String[] arguments 
	// so we can add same test case for multiple group and group execution will be decided by frame developer.  

	@Test (groups= {"SmokeTest","RegressionTest"})
	public void modifyAccount( ) {       // test cases
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.quit();
		//driver.close(); for identifying the testng-failed.xml in test-output i have given this line of code.
		// if there is any failure then only testng-failed.xml file will be updated or it will remain same until new failure of TC takes place 
		//and then it will replace with the new testng-failed.xml file.
	}
}
