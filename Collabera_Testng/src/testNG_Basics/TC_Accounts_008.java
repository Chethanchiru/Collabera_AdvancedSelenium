package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Accounts_008 {

/*	@Test (priority= 0) // in this dependsOnMethods condition all test cases are pass.
	public void createLoan( ) {       // test cases
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}

	@Test (priority=1, dependsOnMethods="createLoan")
	public void modifyLoan( ) {			//by default the priority will be 0, if priority is same methods will execute in alphabetical order.
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");	
		driver.quit();
	}

	@Test (priority=2, dependsOnMethods="createLoan")  
	public void repayLoan( ) {      
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.quit();
	}
	
	@Test (priority=3, dependsOnMethods= {"createLoan", "repayLoan"})  
	public void deleteLoan( ) {      
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.quit();
	}*/
	
	@Test (priority= 0) // in this dependsOnMethods condition Total tests run: 4, Passes: 0, Failures: 1, Skips: 3 bcz i have created java.lang.ArithmeticException: / by zero.
	public void createLoan( ) {       // test cases
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.flipkart.com/");
		int a=5/0;
		driver.quit();
	}

	@Test (priority=1, dependsOnMethods="createLoan") // this method wont get executed bcz create loan is failed and delete loan was depend on it.
	public void modifyLoan( ) {		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");	
		driver.quit();
	}

	@Test (priority=2, dependsOnMethods="createLoan")  // this method wont get executed bcz create loan is failed and delete loan was depend on it. 
	public void repayLoan( ) {      
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.quit();
	}
	
	@Test (priority=3, dependsOnMethods= {"createLoan", "repayLoan"})  // this method wont get executed bcz create loan is failed and delete loan was depend on it.
	public void deleteLoan( ) {      
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.quit();
	}

}
