package vTigerMiniProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
/**
 * 
 * @author chethan
 *
 */
public class ExcelLib {


	static String excelPath = "./testResources/testData.xlsx";
/**
 * This method is used to read string data from an excel file
 * @param sheetName provide the sheet name where you have the test data.
 * @param rowNum provide the row number where you have the test data.
 * @param cellNum provide the cell number where you have the test data.
 * @return it returns the data in the respective sheet, row, cell in the form of String.
 */
	@Test
	public static String readStringData(String sheetName , int rowNum , int cellNum) {
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}

}
