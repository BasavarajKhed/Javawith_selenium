package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement input = driver.findElement(By.xpath("//*[@id='name']"));
//Passing the text into inputbox-alternaye sendkeys
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','John')", input);

		WebElement btnradi = driver.findElement(By.xpath("//*[@id='male']"));
		js.executeScript("arguments[0].click", btnradi);
//click on element -alternative of click
//WebElement btnradi=driver.findElement(By.xpath("//*[@id='male']"));
//
//js.executeScript("arguments[0].click", btnradi);

	}

}
