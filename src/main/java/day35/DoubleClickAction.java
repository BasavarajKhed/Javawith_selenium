package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement doubleclick=driver.findElement(By.xpath("//*[text()=\"Double-click me\"]"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.doubleClick(doubleclick).perform();

	}

}
