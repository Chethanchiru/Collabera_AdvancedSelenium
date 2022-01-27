package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Loan_011 {

	@Test (groups="AdhocTest" , priority=1)
	public void modifyLoan( ) {			//by default the priority will be 0, if priority is same methods will execute in alphabetical order.
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");	
		driver.quit();
	}
}
