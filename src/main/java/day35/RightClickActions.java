package day35;

import java.time.Duration;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickActions {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().window().maximize();
	WebElement button = driver
			.findElement(By.xpath("//*[text()='right click me' and @class='context-menu-one btn btn-neutral']"));
	Actions act = new Actions(driver);
	act.contextClick(button).perform();
	//click on copy
	driver.findElement(By.xpath("//*[text()='Copy' ]")).click();
	Thread.sleep(3000);
	//close alert box
	driver.switchTo().alert().accept();
	

}}
