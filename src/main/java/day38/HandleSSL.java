package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true); // accepts SS certifications
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		
		String act_tittle = driver.getTitle(); //privacy error
		System.out.println(act_tittle);

	}

}
