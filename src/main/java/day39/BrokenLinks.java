package day39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//  the link does not have resource in the server is called as broken link
//	means status code is >=400
//	status code is less than <400 is called as not a broken link
//		status code is <400 its not a broken link

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Number od links:" + links.size());
		int noOfBrokenLinks = 0;
		for (WebElement linkElement : links) {
			String hrefattvalue = linkElement.getAttribute("href");

			if (hrefattvalue == null || hrefattvalue.isEmpty()) {
				System.out.println("href attribute value is null or empty so not possible to check");
				continue;
			}
			try {
				URL linkURL = new URL(hrefattvalue); // converted href value from string to URL format
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection(); // open connection to the
				conn.connect(); // connect to server and sent request the srver
				if (conn.getResponseCode() >= 400) {
					System.out.println(hrefattvalue + "broken link");

				} else {
					System.out.println(hrefattvalue + "not a broken link");
					noOfBrokenLinks++;
				}
			} catch (Exception e) {
			}

		}
		System.out.println("Number of broken link" + noOfBrokenLinks);
	}

}
