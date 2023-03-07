package firstdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution2 {
	
	@Test
	 public void flipkart()
	  {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  
	  }
	 @Test
	 public void snapdeal ()
	 {
		 WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		 driver.get("https://www.snapdeal.com/?utm_source=admitad_846&utm_campaign=f2629753856f7f0fc68296d44f3f761a&utm_content=admitad_846&publisher_id=586854");
		 
	 }
	
	

}
