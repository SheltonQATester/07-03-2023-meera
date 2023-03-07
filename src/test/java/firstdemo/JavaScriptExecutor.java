package firstdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=jKrtxk1huPQ");
		
//		
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		
//		js.executeScript("window.scrollBy(0,500)");//scroll down
//		
//		
//		Thread.sleep(3000);
//		
//		js.executeScript("window.scrollBy(0,-500)");
		JavascriptExecutor l= ((JavascriptExecutor)driver);
		l.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		l.executeScript("window.scrollBy(0,-500)");
		
		
		
		
		
		

	}

}
