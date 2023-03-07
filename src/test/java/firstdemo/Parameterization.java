package firstdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization {
	
	@Test
	@Parameters({"username","password"})
	public void facebooklogin(String uname, String pwd)
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjc3NTY0MDgzLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");
		WebElement l = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		l.sendKeys(uname);
		WebElement p = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		p.sendKeys(pwd);
		
		WebElement h = driver.findElement(By.xpath("//button[@value=\"1\"]"));
		h.click();
	
	}
	
	
	

}
