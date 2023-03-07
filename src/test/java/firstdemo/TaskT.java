package firstdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskT {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();


		ChromeOptions s = new ChromeOptions();
		s.addArguments("incognito");
		WebDriver driver = new ChromeDriver(s);
		//		driver.get("https://demo.automationtesting.in/Alerts.html");
		//		TakesScreenshot t = ((TakesScreenshot)driver);
		//		File source = t.getScreenshotAs(OutputType.FILE);
		//		File destination = new File ("C:\\Users\\THIS PC\\eclipse-workspace\\FirstSeleniumDemoProject\\screenshots2\\shelton.png");
		//		FileUtils.copyFile(source, destination);
		//		JavascriptExecutor j =  ((JavascriptExecutor)driver);
		//		j.executeScript("window.srollBy 0,500");
		//		Thread.sleep(2000);
		//		j.executeScript("window.scrollBy 0,-500");
		//		String v = driver.getWindowHandle();
		//		System.out.println(v);
		//		

		//		driver.get("https://letcode.in/dropdowns");
		//		driver.findElement(By.id("fruits"));
		//		Select s1 = new Select(a);
		//		s1.selectByIndex(2);
		driver.get("https://demo.automationtesting.in/Windows.html");
		//		WebElement l = driver.findElement(By.xpath("(//button[@class=\"btn btn-info\"])[1]"));
		//		l.click();
		//		String m = driver.getWindowHandle();
		WebElement o = driver.findElement(By.xpath("(//a[@data-toggle=\"dropdown\"])[1]"));
		o.click();
		WebElement b = driver.findElement(By.xpath("//a[@href=\"Alerts.html\"]"));
		b.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		





	}

}
