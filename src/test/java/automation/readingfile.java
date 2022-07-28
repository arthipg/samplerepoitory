package automation;

	import java.io.File;
	import java.io.FileInputStream;
	import org.apache.poi.ss.usermodel.Cell;  
	import org.apache.poi.ss.usermodel.Row;  
	import org.apache.poi.xssf.usermodel.XSSFSheet;  
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
	import org.junit.Test;

	public class readingfile {
		@Test
		public void excel() throws Exception {
		File file =    new File("D:\\Sampledata.xlsx");
		FileInputStream fis=new FileInputStream(file);  
		XSSFWorkbook wb=new XSSFWorkbook(fis);   
		XSSFSheet sheet=wb.getSheetAt(0);  
		int row = sheet.getLastRowNum();
		System.out.print(row + "Row Count\n");
		String s=sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.print(s);
		int rowsCount = sheet.getLastRowNum();
	    System.out.println("Total Number of Rows: " + (rowsCount + 1));
	    for (int i = 0; i <= rowsCount; i++) {
	        Row row1 = sheet.getRow(i);
	        int colCounts = row1.getLastCellNum();
	        System.out.println("Total Number of Cols: " + colCounts);
	        for (int j = 0; j < colCounts; j++) {
	            Cell cell = row1.getCell(j);
	            System.out.println("[" + i + "," + j + "]=" + cell.getStringCellValue());
	            wb.close();
	        }
	    }
		}
	}


