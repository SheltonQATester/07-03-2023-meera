package firstdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
//
//		WebElement s = driver.findElement(By.id("email"));
//
//
//		s.sendKeys("shelton@gmail.com");
//		WebElement a = driver.findElement(By.id("pass"));
//		a.sendKeys("pas@123");
		
		WebElement d = driver.findElement(By.name("vsf"));
		d.sendKeys("fgf");
		
		WebElement s = driver.findElement(By.id("u_3_d_YO"));
		s.sendKeys("fgdfg");
		
		WebElement x = driver.findElement(By.name("reg_email__"));
		x.sendKeys("vfdf");
		
		WebElement g = driver.findElement(By.name("reg_passwd__"));
		g.sendKeys("rrf");
		
		
		
		
		
		
		
		
	}

}
