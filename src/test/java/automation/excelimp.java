package automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.junit.Test;

public class excelimp {
	@Test
	public static void main(String args[]) throws IOException 
	{

		FileInputStream inputStream = new FileInputStream("D:\\sampledata.xlsx"); //Path of the excel file
		HSSFWorkbook wb=new HSSFWorkbook(inputStream); //Creating a workbook
		HSSFSheet sheet=wb.getSheet(0);
		 //Find number of rows in excel file   
		int rowCount =  sheet.getLastRowNum()- sheet.getFirstRowNum();
		int colCount = sheet.
		//Create a loop over all the rows of excel file to read it
		for (int i = 0; i < rowCount+1; i++)
		{
		System.out.println(Sheet.getRow(i).getCell(0).getStringCelllValue());
		}
		for(int j=0;j<colCount;j++)
		{
		System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
		}
		}
}
