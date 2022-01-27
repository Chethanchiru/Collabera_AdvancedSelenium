package vTigerMiniProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
/**
 * 
 * @author Chethan
 *
 */
public class TC_6 {

	@Test
	public void createContact() { 

		String testUrl=ExcelLib.readStringData("Sheet1", 0, 0);
		String username=ExcelLib.readStringData("Sheet1", 0, 1);
		String password=ExcelLib.readStringData("Sheet1", 0, 2);
		String expectedLoginPageTitle=ExcelLib.readStringData("Sheet1", 1, 0);
		String expectedHomePageTitle=ExcelLib.readStringData("Sheet1", 1, 1);
		String expectedContactListPageTitle=ExcelLib.readStringData("Sheet1", 2, 0);
		String contactFirstName = ExcelLib.readStringData("Sheet1", 2, 1);
		String contactLastName = ExcelLib.readStringData("Sheet1", 2, 2);
		String expectedCreateNewContactURL = ExcelLib.readStringData("Sheet1", 3, 0);
		String expectedExportContactURL = ExcelLib.readStringData("Sheet1", 3, 1);

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(testUrl);
		String ActualLoginPageTitle = driver.getTitle();
		if(ActualLoginPageTitle.equals(expectedLoginPageTitle)) {
			Reporter.log("Login page is displayed successfully", true);
		}else {
			Reporter.log("Login page is not displayed successfully", true);
		}

		LoginPage loginPage =new LoginPage(driver);
		loginPage.LoginToApp(username, password);

		String ActualHomePageTitle = driver.getTitle();
		if(ActualHomePageTitle.equals(expectedHomePageTitle)) {
			Reporter.log("Home page is displayed successfully", true);
		}else {
			Reporter.log("Home page is not displayed successfully", true);
		}

		HomePage homePage = new HomePage(driver);
		homePage.homePageApp(contactFirstName, contactLastName);

		String actualContactListPageTitle = driver.getTitle();
		if(actualContactListPageTitle.equals(expectedContactListPageTitle)) {
			Reporter.log("Contact List page is displayed successfully", true);
		}else {
			Reporter.log("Contact List is not displayed successfully", true);
		}

		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		String actualCreateNewContactURL = driver.getCurrentUrl();
		System.out.println(actualCreateNewContactURL);
		if(actualCreateNewContactURL.equals(expectedCreateNewContactURL)) {
			Reporter.log("Create New Contact page is displayed successfully", true);
		}else {
			Reporter.log("Create New Contact page is not displayed successfully", true);
		}

		String actualExportContactURL = driver.getCurrentUrl();
		if(actualExportContactURL.equals(expectedExportContactURL)) {
			Reporter.log("Export Contact page is displayed successfully", true);
		}else {
			Reporter.log("Export Contact page is not displayed successfully", true);
		}


	}

}
