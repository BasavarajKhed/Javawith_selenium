package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		1.scroll down page by pixel number
//		js.executeScript("window..scrollBy(0,1500)","");
//		System.out.println(js.executeScript("return window.pageYOffset;"));

//		driver.findElement(By.xpath(""))
//		2. scroll the page till the element is visible
//		WebElement ele = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
//
//		js.executeScript("arguments[0].scrollIntoView();", ele);
//		3.till end of the page
		
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

		
		
	}

}
