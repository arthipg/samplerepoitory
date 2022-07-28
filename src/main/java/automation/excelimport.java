package automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class excelimport {
	public static void main(String args[]) throws IOException {
		
		File file =  new File("D:\\Sampledata");  //Create an object of FileInputStream class to read excel file
		  
	    FileInputStream inputStream = new FileInputStream(file);		
		
		HSSFWorkbook wb=new HSSFWorkbook(inputStream); 
		
	    HSSFSheet sheet=wb.getSheet("name");    		  //either we can the passs the index or you can give the name

		int rowCount=sheet.getLastRowNum();
		
		for(int i=0;i<=rowCount;i++)
		{
			System.out.print(sheet.getRow(i).getCell(0).getStringCellValue());
		}
		
		/*int colcount = 0;
		for(int j=0;j<colcount;j++)
		{
			int i = 0;
			sheet.getRow(i).getCell(j).getStringCellValue();
		}*/
		
		
	}
}
