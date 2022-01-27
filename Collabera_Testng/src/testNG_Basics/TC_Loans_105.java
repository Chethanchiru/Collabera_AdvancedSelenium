package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Loans_105 { // enabled parameter by default it will be true, it is used to disable your test case.
	
	@Test (priority= -1)
	public void flipkart( ) {       // test cases
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}

	@Test (priority=1, enabled=true)
	public void myntra( ) {			//by default the priority will be 0, if priority is same methods will execute in alphabetical order.
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");	
		driver.quit();
	}

	@Test (priority=0, enabled=false)  //  enabled parameter is false it wont execute the test case.
	public void instagram( ) {      
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.quit();
	}

}
