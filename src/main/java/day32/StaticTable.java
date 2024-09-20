package day32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
//		find the total number of rows in a table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); // if we have single table
//		int rows=driver.findElements(By.tagName("tr")).size(); // if we have multiple table
//		Find total number of columns
		int coloumns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
//		int coloumns = driver.findElements(By.tagName("th")).size();
		System.out.println("Number of columns " + coloumns);
		System.out.println("Number of rows  " + rows);
//		Read specific data from row and column (5th row and 1st column)
		// table[@name='BookTable']//tr[5]//td[1]
		String BookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
//		System.out.println("BookName is " + BookName);
//		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");

//		String Subject = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText();
//		System.out.println("Subject is " + Subject);

//		for (int r = 2; r <= rows; r++) {
//			for (int c = 1; c <= coloumns; c++) {
//				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]"))
//						.getText();
//				System.out.print(value+"\t");
//			}
//			System.out.println();
//			
//		}
//		book name for perticular author
//		for (int r=2;r<=rows;r++) {
//			String AuthorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]")).getText();
//			if(AuthorName.equals("Mukesh")) {
//				String BName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[1]")).getText();
//				System.out.println(BName +"\t"+AuthorName);
//			}
//		}

//		print all the prices and total prices
		int total = 0;
		for (int r = 2; r <= rows; r++) {
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();
			System.out.println(price);
			total = total + Integer.parseInt(price);

		}
		System.out.println("Total price of the books: " + total);

	}

}
