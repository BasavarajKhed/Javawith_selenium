package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='inputText1']")).sendKeys("WELCOME");
		Actions act = new Actions(driver);

		// ctrl+A -selects the text
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

		// ctrl+c copy the text into clipboard
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

		// tab-shift to 2nd box
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(3000);
		// ctrl+v-past the text
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

	}

}
