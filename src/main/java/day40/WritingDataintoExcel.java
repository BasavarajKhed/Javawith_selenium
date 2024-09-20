package day40;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataintoExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\myfile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");
		XSSFRow Row1=sheet.createRow(0);
		Row1.createCell(0).setCellValue("Java");
		Row1.createCell(1).setCellValue("19");
		Row1.createCell(2).setCellValue("Automation");
		
		XSSFRow Row2=sheet.createRow(1);
		Row2.createCell(0).setCellValue("Python");
		Row2.createCell(1).setCellValue("3");
		Row2.createCell(2).setCellValue("Automation");
		
		XSSFRow Row3=sheet.createRow(2);
		Row3.createCell(0).setCellValue("C#");
		Row3.createCell(1).setCellValue("5");
		Row3.createCell(2).setCellValue("Automation");
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created..");
		
		
	}

}
