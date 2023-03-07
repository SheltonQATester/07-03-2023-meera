package firstdemo;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElements3 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> d = driver.findElements(By.tagName("a"));
		int size = d.size();
		System.out.println(size);
		
		for(WebElement s:d)
		{
			System.out.println(s.getText());
		}
		
		//Takescreenshot
		
		TakesScreenshot tk =((TakesScreenshot)driver);
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File des = new File ("C:\\Users\\THIS PC\\eclipse-workspace\\FirstSeleniumDemoProject\\screenshot\\image.png");
		 FileUtils.copyFile(src, des);
		
		
		

	}

}
