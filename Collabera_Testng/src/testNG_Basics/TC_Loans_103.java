package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Loans_103 { //invocationCount by default it will be 1, if it is 0 or -ve it will not run the test case and we can use final variable for invocation count. 
	
	final int a= -1;
	@Test (priority= a)
	public void flipkart( ) {       // test cases
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}

	@Test (priority=1)
	public void myntra( ) {			//by default the priority will be 0, if priority is same methods will execute in alphabetical order.
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");	
		driver.quit();
	}

	@Test (invocationCount =0)  // how to run same test case for multiple times. use invocationCount and if invocationCount is 0 then this method wont execute.
	public void instagram( ) {       
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.quit();
	}

	@Test (priority=0 ,invocationCount =3)  
	public void nykaa( ) {       
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.quit();
	}
}
