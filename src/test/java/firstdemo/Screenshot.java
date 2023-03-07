package firstdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://facctum.com/");
		TakesScreenshot t = ((TakesScreenshot)driver);
		File sn= t.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\THIS PC\\eclipse-workspace\\FirstSeleniumDemoProject\\shelton\\shel.png");
		FileUtils.copyFile(sn,destination);
	}
}
