package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Accounts_006 { // timeOut is used to run time critical test cases.
	
	@Test (timeOut=1000) // it means the page should be loaded within the given time or our test case will fail.
	public void modifyAccount( ) throws InterruptedException {       // test cases
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		driver.get("https://www.amazon.com/");
		driver.quit();
	}
}
