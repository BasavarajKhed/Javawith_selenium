package day28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Seleniuum");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String pearentHandle=driver.getWindowHandle();
//		driver.findElement(By.xpath("//div[@id='wikipedia-search-result-link']/a")).click();
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		System.out.println(links.size());
		
		List<WebElement>linksd=driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
//		for(int i=0;i<linksd.size();i++) {
//			linksd.get(i).click();
//		}
		for(WebElement l: linksd ) {
			l.click();
			
		}
		

		Set<String> windowIds = driver.getWindowHandles();
		System.out.println(windowIds);
//
		for (String winID : windowIds) {
			String title = driver.switchTo().window(winID).getTitle();
			if (title.equals("Automation Testing Practice")) {
				System.out.println(driver.getCurrentUrl());
			}
		}
//			}
		
		
		

		/*
		 * driver.findElement(By.xpath(
		 * "(//div[@id='wikipedia-search-result-link'])[1]/a")).click();
		 */

//		  for (WebElement e : links) { e.click(); String parenturl =
//		  driver.getWindowHandle(); Set<String> handles = driver.getWindowHandles();
//		  for (String s : handles) { if (s != parenturl) { driver.switchTo().window(s);
//		  
//		  driver.close(); }
//		 
		 } 
//		 driver.switchTo().window(parenturl); }

	}
//}
