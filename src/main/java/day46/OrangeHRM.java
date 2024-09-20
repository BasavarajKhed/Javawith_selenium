package day46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class OrangeHRM {

	WebDriver driver;

	@BeforeClass
	void setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	void testLogo() {
		boolean status = driver.findElement(By.xpath("//*[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}

	@Test(priority = 2)
	void testAppURL() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/");
	}

	@Test(priority = 3, dependsOnMethods = { "testAppURL" })
	void testHomePageTittle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}

}
