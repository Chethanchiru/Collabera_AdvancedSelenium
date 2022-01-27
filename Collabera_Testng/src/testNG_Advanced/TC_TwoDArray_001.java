package testNG_Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_TwoDArray_001 {
	
	@DataProvider
	public String[][] credintials() {
		String[] [] arr= { 
							{"admin","manager"},
							{"trainee","trainee"}
						};
		return arr;
	}

	@Test(dataProvider="credintials")
	public void ReadMultipleDataFromExcel(String [] data) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(data[0]);
		driver.findElement(By.name("pwd")).sendKeys(data[1]);
		driver.findElement(By.id("loginButton")).click();
		//driver.quit();

	}
}
