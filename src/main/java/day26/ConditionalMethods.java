package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		// isDisplayed
//		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		System.out.println("Display status of logo " + logo.isDisplayed());
//     isEnabled
//		boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
//		System.out.println("Enable status " +status);
//		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
//		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
//		System.out.println("Before Selection");
//		System.out.println(male_rd.isSelected());
//		System.out.println(female_rd.isSelected());
//		
//		System.out.println("After selecting Male");
//		male_rd.click();
//		System.out.println(male_rd.isSelected()); // true
//		System.out.println(female_rd.isSelected()); // false
//		
//		System.out.println("After selecting Female");
//		female_rd.click();
//		
//		System.out.println(male_rd.isSelected()); // true
//		System.out.println(female_rd.isSelected()); // false
		
		boolean newsletter=driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		
		System.out.println( newsletter);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
