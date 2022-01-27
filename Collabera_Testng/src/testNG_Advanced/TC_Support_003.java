package testNG_Advanced;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_Support_003 {// for executing the testcase in parallel by using dataprovider concept

	@DataProvider(name="SearchProducts",parallel=true) // if we r pasing n data it will recieve the data in parallel at a time and  
	public String[] sendMobileInfo( ) throws EncryptedDocumentException, IOException {//@Test method will be invoked for n information at a time
		FileInputStream fis = new FileInputStream("./testResources/testAdvacedData.xlsx");// & it will execute all the browser at a time.
		Workbook workbook = WorkbookFactory.create(fis);

		Sheet dataSheet = workbook.getSheet("Sheet1");
		int rowCount = dataSheet.getPhysicalNumberOfRows();
		String[] arr= new String[rowCount];

		for(int i=0;i<rowCount;i++) {
			arr[i]=dataSheet.getRow(i).getCell(0).toString();
		}
		return arr;
	}

	@Test(dataProvider="SearchProducts")
	public void createARequest(String mobileName) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(mobileName, Keys.ENTER);
		driver.quit();
	}
	
}
