package firstdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElemnts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> d = driver.findElements(By.tagName("a"));
		int size = d.size();
		System.out.println(size);
		
		for(WebElement m:d)
		{
			System.out.println(m.getText());		
					
					
				}
		
		
		
		
	}

}
