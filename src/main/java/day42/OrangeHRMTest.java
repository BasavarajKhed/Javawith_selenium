package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMTest {

	WebDriver driver;

	@Test(priority = 1)
	void openapp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

	}

	@Test(priority = 2)
	void testlogo() throws InterruptedException {
		Thread.sleep(3000);
		boolean status=driver.findElement(By.xpath("//*[@class='orangehrm-login-branding']//img")).isDisplayed();
		System.out.println("Logo Displayed..."+status);
	}

	@Test(priority = 3)
	void testLogin() {
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		

	}

	@Test(priority = 4)
	void testcloseAPP() {
		driver.close();

	}
}
