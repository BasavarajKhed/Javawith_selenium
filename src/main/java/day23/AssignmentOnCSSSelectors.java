package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentOnCSSSelectors {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.cssSelector(".nav-link.dropdown-toggle[href='https://demo.opencart.com/en-gb/catalog/desktops']")).click();
		
//		driver.findElement(By.cssSelector("div[id='content'] div:nth-child(1) div:nth-child(1) div:nth-child(2) div:nth-child(1) h4:nth-child(1) a:nth-child(1)")).click();
//		driver.findElement(By.linkText("Contact Us")).click();
		
//		driver.findElement(By.cssSelector("input.form-control[name='search']")).sendKeys("Basavaraj");
		driver.findElement(By.cssSelector("#nav-link")).click();

//		driver.close();

	}

}
