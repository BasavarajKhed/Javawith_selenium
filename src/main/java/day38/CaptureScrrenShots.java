package day38;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.devtools.v128.filesystem.model.File;

public class CaptureScrrenShots {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
//		ChromeDriver	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
//		capture full page screenshot
//		TakesScreenshot tc=driver;
//		1.full page 
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
//		String s="C:\\Users\\BAKHED\\Downloads\\demo\\ss.png";
//		File testss=new File(s);
//		FileHandler.copy(sourcefile, testss);

//		File targetfile = new File("C:\\Javawith_selenium\\ScreenShots\\fullpage.png");
//		File targetfile=new File("C:\\Javawith_selenium\\ss");
//	File targetfile=new File(System.getProperty("user.dir")+"\\ss\\fullpage.png");
//sourcefile.renameTo(targetfile);
		// 2.capture the xpath from the specific section of the point
//		WebElement ps = driver.findElement(By.xpath("//*[@class='product-grid home-page-product-grid']"));
//		File sourcefile = ps.getScreenshotAs(OutputType.FILE);
//		File targetfile = new File(System.getProperty("user.dir")+"\\ss\\dd.png");
//		sourcefile.renameTo(targetfile);
		
		//3.ecapture the ss of webelement
		WebElement ps1 =driver.findElement(By.xpath("//*[@alt='nopCommerce demo store']"));
		File sourcefile = ps1.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\ss\\sp.png");
		sourcefile.renameTo(targetfile);

	}

}
