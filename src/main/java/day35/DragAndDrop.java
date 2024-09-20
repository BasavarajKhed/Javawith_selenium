package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//*[text()='Drag me to my target']"));
		WebElement target = driver.findElement(By.xpath("//*[@id='droppable']"));

		act.dragAndDrop(source, target).perform();

	}

}
