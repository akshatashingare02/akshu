package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {
	XSSFSheet sh;
	

	public  ExcelHelper(String Filename,String Sheetname)
	{
		File f = new File(System.getProperty("user.dir")+ "\\"+Filename);

		try {
			FileInputStream fis = new FileInputStream(f);

			XSSFWorkbook wb = new XSSFWorkbook(fis);

			sh= wb.getSheet(Sheetname);
			
			
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<String> getKeysList() {

		ArrayList<String> data = new ArrayList<>();
		for(int i = 0;i<=sh.getLastRowNum();i++)
		{
			XSSFRow row1 = sh.getRow(i);
			XSSFCell cell1 = row1.getCell(0);

			String key= getaccordingtocelltype(cell1);
			data.add(key);
        }
		return data;
	}

	public ArrayList<String> getValueList() {

		ArrayList<String> data = new ArrayList<>();
		for(int i = 1;i<=sh.getLastRowNum();i++)
		{
			XSSFRow row1 = sh.getRow(i);
			XSSFCell cell1 = row1.getCell(1);

			String Value= getaccordingtocelltype(cell1);
			data.add(Value);
        }
		return data;
	}
	
	public static String getaccordingtocelltype(XSSFCell cell1) {
	Object data=null;
		switch (cell1.getCellType()) {
		case STRING:
			System.out.println(cell1.getStringCellValue());
			break;
		case BOOLEAN:
			System.out.println(cell1.getBooleanCellValue());
			break;
		case NUMERIC:
			System.out.println(cell1.getNumericCellValue());
			break;
		case FORMULA:
			System.out.println(cell1.getCellFormula());
			break;
		case BLANK:
			System.out.println("cell is blank");
			break;

		default:
			System.out.println("unknow cell type");
			break;
		}
		return data.toString();

	} 

}

