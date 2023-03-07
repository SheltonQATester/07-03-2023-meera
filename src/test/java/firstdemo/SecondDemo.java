package firstdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondDemo {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();//chromedriver()
		WebDriver driver = new ChromeDriver();// ChromeDriver()
//		driver.get("https://www.facebook.com");
//		driver.manage().window().maximize();
//		driver.get("https://www.naukri.com");
//		driver.get("https://www.linkedin.com");
//		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
//		driver.get("https://www.facctum.com");
//		driver.get("https://www.synechron.com");
//		driver.get("https://www.ustglobal.com");
//		driver.get("https://www.amazon.in");
//		driver.get("https://www.flipkart.com/");
//		driver.close();
		
		
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.navigate().to("https://www.naukri.com");
		driver.navigate().to("https://www.synechron.com");
		driver.navigate().to("https://www.flipkart.com/");
		
		
	// get is used the launch the url only, where as navigate is used for back, forward, refresh	
		
		Thread.sleep(3000);
		
//		driver.navigate().back();//back
//		
//		driver.navigate().forward();//forward
//		
//		driver.navigate().refresh();// refresh
//		
		
		
		
		
		
	
		
		
		
	
		
		

	}

}
