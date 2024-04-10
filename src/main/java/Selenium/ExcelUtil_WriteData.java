package Selenium;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil_WriteData {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Hari Bol");
		
		Object[][] empdata = {{"Name","Id","Job"},
				              {"Ajay",101,"Infosys"},
				              {"Harshit",101,"TCS"},
				              {"Tarun",101,"Infore"},
		                     };
		int rows = empdata.length;
		System.out.println("rows: "+rows);
		int cols = empdata[1].length;
		System.out.println("cols: "+cols);
		
		for(int r=0;r<rows;r++) {
			XSSFRow row = sheet.createRow(r);
			for(int c=0;c<cols;c++) {
				XSSFCell cell=row.createCell(c);
				Object value = empdata[r][c];
				
				if(value instanceof String) {
					cell.setCellValue((String)value);
				}
				if(value instanceof Integer) {
					cell.setCellValue((Integer)value);
				}
			}
		}
		
		String FilePath = "C:\\\\Users\\\\ajay7\\\\eclipse-workspace\\\\Selenium_Practice\\\\src\\\\main\\\\resources\\\\DataFiles\\\\Emp_Test_Data.xlsx";
		FileOutputStream fo = new FileOutputStream(FilePath);
		workbook.write(fo);
		
		fo.close();
		
		System.out.println("Written successfully in excel");
	}

}
