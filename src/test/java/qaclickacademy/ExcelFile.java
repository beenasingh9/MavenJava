package qaclickacademy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ExcelFile {

	@Test
	public static void method() throws IOException {

		File file = new File("F:\\AppiumProject\\Mavenjava\\Mavenjava\\input.xlsx");   //creating a new file instance  
		FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file  
		//creating Workbook instance that refers to .xlsx file  
		XSSFWorkbook wb = new XSSFWorkbook(fis);   
		XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object  
		Iterator<Row> itr = sheet.iterator();    //iterating over excel file  
		while (itr.hasNext())                 
		{  
		Row row = itr.next();  
		Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column  
		while (cellIterator.hasNext())   
		{  
		Cell cell = cellIterator.next();  
    //field that represents string cell type  
		System.out.print(cell.getStringCellValue() + "\t\t\t");  
		  
		
		}  
		System.out.println("");  
		} 
		

	}

}
