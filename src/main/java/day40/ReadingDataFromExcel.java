package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\Data_To_Read.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1"); // XSSFSheet sheet=workbook.getSheetAt(0);

		int totalRows = sheet.getLastRowNum();
		int totalcells = sheet.getRow(1).getLastCellNum();
		System.out.println("Total number of Rows " + totalRows);
		System.out.println("Total Number of cells " + totalcells);
		
		for(int r=0;r<=totalRows;r++) {
		XSSFRow currentrow=sheet.getRow(r);
			
		for(int c=0;c<totalcells;c++)
		{
			XSSFCell cell=currentrow.getCell(c);
			System.out.print(cell.toString()+"\t");
		}
		System.out.println();
		}
		workbook.close();
		file.close();
	}

}
