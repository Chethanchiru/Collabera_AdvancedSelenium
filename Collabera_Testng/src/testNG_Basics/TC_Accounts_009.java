package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Accounts_009 {

	@Test (groups="SmokeTest" , priority= 0) // groups is used to add the test case to an particular group.
	public void createLoan( ) {       // test cases
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}

	@Test (groups="RegressionTest" , priority=1, dependsOnMethods="createLoan")
	public void modifyLoan( ) {			//by default the priority will be 0, if priority is same methods will execute in alphabetical order.
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");	
		driver.quit();
	}

	@Test (groups="SmokeTest" , priority=2, dependsOnMethods="createLoan")  
	public void repayLoan( ) {      
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.quit();
	}
	
	@Test (groups="RegressionTest" , priority=3, dependsOnMethods= {"createLoan", "repayLoan"})  
	public void deleteLoan( ) {      
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.quit();
	}
}
