package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
//		Xpath with multiple element
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Basavaraj");
//Xpath with multiple element
//		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("BK");
//		Xpath with and or operator
//		driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Khed");
//		driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("Khed");
//		driver.findElement(By.xpath("//*[text()='Desktops']")).click();
//		boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
//		System.out.println(displaystatus);
//		String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
//		System.out.println(value);
//		Xpath with contains
//		driver.findElement(By.xpath(" //input[contains(@placeholder,'Sea')]")).sendKeys("Contains");
//		Xpath with starts with
//		driver.findElement(By.xpath(" //input[starts-with(@placeholder,'Sea')]")).sendKeys("starts-with");
	boolean st=	driver.findElement(By.xpath("//div[@id='header-cart']/div/button")).isDisplayed();
		System.out.println(st);
		
//		driver.close();
	}

}
