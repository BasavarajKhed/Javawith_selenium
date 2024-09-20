package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLocators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ifttt.com/");
		driver.manage().window().maximize();
		
//		Total Number of links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+links.size());
		
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println("Total Number of images :"+images.size());
		driver.findElement(By.linkText("Start today")).click();

        
		
		
	}

}
