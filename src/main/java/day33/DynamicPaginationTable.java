package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.ecomdeveloper.com/demo/admin/index.php");
//		driver.get("https://demo.opencart.com/admin/index.php?route=catalog/category&user_token=8bd218eded699f10ef2109d4b5ef8053");
		
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demoadmin");
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demopass");
//
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

//		driver.findElement(By.xpath("//*[@class='parent']")).click();
//		driver.findElement(By.cssSelector(".parent.collapsed[href='#collapse9']")).click();
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
//		driver.findElement(By.cssSelector("ul[id='collapse9'] li[class='active'] a")).click();
		driver.findElement(By.xpath("//ul[@id='collapse9']//a[contains(text(),'Customers')]")).click();
		String text=driver.findElement(By.xpath("//*[contains(text(),'Showing')]")).getText();
		int total_Pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		System.out.println("Total Number of pages "+total_Pages);
		for(int p=1;p<=5;p++) {
			if(p>1) {
				WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_page.click();
				Thread.sleep(3000);
			
			}
//			Reading data from page
			int no_of_rows=driver.findElements(By.xpath("//*[@class='table table-bordered table-hover']//tbody//tr")).size();
			for(int r=1;r<=no_of_rows;r++) {
				String Custmor_Name=driver.findElement(By.xpath("//*[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String email=driver.findElement(By.xpath("//*[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				String status=driver.findElement(By.xpath("//*[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
				System.out.println(Custmor_Name+"\t"+email+"\t"+status);
			}
		}
	
		
	}

}
