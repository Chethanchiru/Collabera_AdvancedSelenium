package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Loans_104 {
	// threadPoolSize by default it will be 1, it is used to run the same test case multiple times in parallel and without invocation count we cannot use threadPoolsize.
	// if thread pool size is zero then @Test will run the method.
	
	final int a= 2;
	@Test (priority= a)
	public void flipkart( ) {       // test cases
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}

	@Test (priority=1, invocationCount =2, threadPoolSize=2)
	public void myntra( ) {			//by default the priority will be 0, if priority is same methods will execute in alphabetical order.
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");	
		driver.quit();
	}

	@Test (priority=3, invocationCount =4, threadPoolSize=2)
	public void instagram( ) {       // test cases
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.quit();
	}


}
