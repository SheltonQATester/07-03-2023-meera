package firstdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class GetNavigation {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.get("https://www.naukri.com");
		driver.get("https://www.linkedin.com");
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.get("https://www.facctum.com");
		driver.get("https://www.synechron.com");
		driver.get("https://www.ustglobal.com");
		driver.get("https://www.flipkart.com/");


		driver.navigate().to("https://www.amazon.in");
		driver.navigate().to("https://www.naukri.com");
		
		driver.navigate().refresh();
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		String s = driver.getTitle();
		
		System.out.println(s);
       String v = driver.getCurrentUrl();
       System.out.println(v);





	}

}
