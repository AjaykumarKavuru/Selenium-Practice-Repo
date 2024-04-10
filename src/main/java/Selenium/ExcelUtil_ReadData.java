package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil_ReadData {

	public static void main(String[] args) throws IOException {

		String ExcelPath = "C:\\Users\\ajay7\\eclipse-workspace\\Selenium_Practice\\src\\main\\resources\\DataFiles\\Test_Data.xlsx";
		FileInputStream fi = new FileInputStream(ExcelPath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		System.out.println("rows: "+rows);
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println("cols: "+cols);
		
		for(int r=0;r<=rows;r++) {
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<cols;c++) {
			   XSSFCell	cell = row.getCell(c);
			   System.out.println(cell.getStringCellValue());
			}
		}
	}

}
