package day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		WebElement regLink = driver.findElement(By.xpath("//*[text()='Register' and @class='ico-register']"));

		Actions act = new Actions(driver);
//		ctrl+RegLink
		act.keyDown(Keys.CONTROL).click(regLink).keyDown(Keys.CONTROL).perform();
//swithing to registration page
		List<String> ids = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(ids.get(1)); // switch to registartion page
		driver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("Basavaraj");
		Thread.sleep(2000);

		driver.switchTo().window(ids.get(0)); // home page
		driver.findElement(By.xpath("//*[@id='small-searchterms']")).sendKeys("TShirts");

	}

}
