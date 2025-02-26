package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
//		name
//		driver.findElement(By.name("search")).sendKeys("Mac");
//		ID
//		boolean menu=driver.findElement(By.id("menu")).isDisplayed();
//		System.out.println(menu);
//		LinkText
//		driver.findElement(By.linkText("Tablets")).click();
//		Partial Linktext
//		driver.findElement(By.partialLinkText("Table")).click();
 
//		list-inline-item classname
List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
System.out.println("total number of header links: "+headerLinks.size());
		
//		tagname
//		List<WebElement> links=driver.findElements(By.tagName("a"));
//		System.out.println("Total number of links:"+links.size());
		
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println("Total Number of images :"+images.size());
		
		
		
		
		
//driver.close();

	}

}
