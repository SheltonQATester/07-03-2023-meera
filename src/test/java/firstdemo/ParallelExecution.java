package firstdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution {
	
	@Test
	public void youtube()
	{
	     WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.youtube.com/watch?v=jKrtxk1huPQ");
	}
	@Test
	
	 public void Automationdemo()
	  {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.automationtesting.in/Windows.html#google_vignette");
		  
	  }
	

}
