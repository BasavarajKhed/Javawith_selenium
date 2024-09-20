package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(dataProvider = "dp")
	void testLogin(String email, String pwd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		boolean status = driver.findElement(By.xpath("//*[@class='col-sm-9' ]//h2[1]")).isDisplayed();

		if (status == true) {
			driver.findElement(By.xpath("//*[@class='list-group-item' ][13]")).click();
			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}

	}

	@AfterClass
	void tearDown() {
		driver.close();
	}

	@DataProvider(name ="dp",indices= {3})
	Object[][] loginData() {
		Object data[][] = { { "abc@gamil.com", "test123" }, 
				{ "xyz@gamil.com", "test023" },
				{ "john@gamil.com", "test@123" }, 
				{ "pavanol123@gmail", "test@123" },
				{ "johncanedy@gamil.com", "test" }, };

		return data;
	}

}
