package firstdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Frame;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsTw {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/frame");
//		WebElement q = driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]"));
//		q.click();
//		WebElement e = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]"));
//		e.click();
//		Alert a = driver.switchTo().alert();
//		Thread.sleep(3000);
//		a.dismiss();

//		WebElement t = driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[3]"));
//		t.click();
//		WebElement u = driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]"));
//		u.click();
//		Alert z = driver.switchTo().alert();
//		z.sendKeys("shelton");
//		z.accept();
		
		
		//driver.switchTo().frame("fname");
		
		driver.switchTo().frame(0);
		
		WebElement a = driver.findElement(By.xpath("//input[@name=\"fname\"]"));
		a.sendKeys("shelton");
		WebElement f = driver.findElement(By.xpath("//input[@name=\"lname\"]"));
		f.sendKeys("antony");
		driver.switchTo().frame(0);
		WebElement j = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		j.sendKeys("ddsff");
		
//		driver.switchTo().parentFrame();
//		WebElement l = driver.findElement(By.xpath("//input[@name=\"lname\"]"));
//		l.sendKeys("dalston");
		
		driver.switchTo().defaultContent();
		
		WebElement c = driver.findElement(By.xpath("//a[@class=\"card-footer-item\"]"));
		c.click();
		
		
		
		
		
		
	}

}
