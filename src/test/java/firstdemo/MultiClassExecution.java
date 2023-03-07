package firstdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiClassExecution {
	
	
	@Test(priority = 3, groups = "smoke")
public void youtube()
{
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.youtube.com/watch?v=jKrtxk1huPQ");
}
   @Test(priority =1)
  public void Automationdemo()
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Windows.html#google_vignette");
	  
  }
   @Test(priority= 2, groups = "smoke")
		 
 public void Frame ()
 {
	 WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	 driver.get("https://demo.automationtesting.in/Windows.html#google_vignette");
	 
 }
 @Test(priority= 4) 
 public void Browserstack()
 {
	 
	 WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	 driver.get("https://demo.automationtesting.in/Windows.html#google_vignette");
	
 }
 
	
	
	
	
	
	
	
	
	
	

}
