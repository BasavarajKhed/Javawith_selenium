package day29;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAuthanticatedPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
