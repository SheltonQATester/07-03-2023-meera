package firstdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstDemoProject {
	
	
	
	public static void main(String[] args)
	{ 
		WebDriverManager.chromedriver().setup();// to set the path of the browser driver
		
		WebDriver driver = new ChromeDriver();// It will launch empty browser
		
		driver.get("https://www.facebook.com");// to launch the browser
		
		
		driver.manage().window().maximize();// to maximize the browser
		
		//10		
	}
}
