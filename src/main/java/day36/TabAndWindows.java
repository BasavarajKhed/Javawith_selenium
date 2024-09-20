package day36;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabAndWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.nopcommerce.com/");
		driver.switchTo().newWindow(WindowType.WINDOW); //till selenium 3 it was not possible
		driver.get("https://dummy-tickets.com/buyticket");
//		driver.manage().window().maximize();


	}

}
