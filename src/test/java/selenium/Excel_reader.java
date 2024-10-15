package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f = new File(System.getProperty("user.dir")+ "\\KT.xlsx");

FileInputStream fis = new FileInputStream(f);

XSSFWorkbook wb = new XSSFWorkbook(fis);

XSSFSheet sh= wb.getSheet("July");

XSSFRow row = sh.getRow(1);

XSSFCell cell = row.getCell(1);

String val = cell.getStringCellValue();

System.out.println(val);

String val1 = sh.getRow(0).getCell(0).getStringCellValue();
System.out.println(val1);

System.out.println(sh.getRow(3).getCell(0).getStringCellValue());
	}

	
	
}
