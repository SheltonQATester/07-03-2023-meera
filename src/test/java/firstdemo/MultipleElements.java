package firstdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElements {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
//		int size = links.size();
//		System.out.println(size);
		
		
		int x = links.size();
		System.out.println(x);
		//Enhanced for loop
		
		
		
		for(WebElement s:links)
		{
			System.out.println(s.getText());
		}
		
		
		
		
		
		
	}

}
