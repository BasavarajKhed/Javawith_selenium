package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class HandleMultipleBrowser {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
		try {
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@alt='youtube logo']")).click();
//		driver.close();
		driver.quit();
				
		

	}

}
