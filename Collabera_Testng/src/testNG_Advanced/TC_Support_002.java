package testNG_Advanced;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class TC_Support_002 {

	@DataProvider
	public String[] sendMobileInfo( ) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testResources/testAdvacedData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);

		Sheet dataSheet = workbook.getSheet("Sheet1");
		int rowCount = dataSheet.getPhysicalNumberOfRows();
		String[] arr= new String[rowCount];

		for(int i=0;i<rowCount;i++) {
			arr[i]=dataSheet.getRow(i).getCell(0).toString();
		}
		return arr;
	}

	@Test(dataProvider="sendMobileInfo")// 
	public void createARequest(String mobileName) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(mobileName, Keys.ENTER);
		driver.quit();
	}
	
	
	/* you can do this method also the surrounding with try and catch
	public String[] CreateNewAccount() {
		Workbook workbook=null;
		String absPath = "./testResources/testAdvacedData.xlsx";
		try {
			FileInputStream fis = new FileInputStream(absPath);
			WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sheet dataSheet1 = workbook.getSheet("Sheet1");
		int rowCount = dataSheet1.getPhysicalNumberOfRows();
		
		String[] arr= new String[rowCount];
		
		for(int i=0; i<rowCount; i++) {
			arr[i]=dataSheet1.getRow(i).getCell(0).toString();
		}
		return arr;
	}*/
}
