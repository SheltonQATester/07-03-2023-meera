package firstdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDataTest {
	
	@Test(dataProvider = "shelton")
	public void facebooklogin(String ffasass, String dvfsv)
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjc3NTY0MDgzLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");
		WebElement l = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		l.sendKeys(ffasass);
		WebElement p = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		p.sendKeys(dvfsv);
		
		WebElement h = driver.findElement(By.xpath("//button[@value=\"1\"]"));
		h.click();
	
	}
	
	@DataProvider
	public Object[][] shelton()
	{
		Object a[][] = new Object[10][2];
		a[0][0]="dfdgbfb";
		a[0][1]="bfxbf";		
		a[1][0]="fbdfb";		
		a[1][1]="dbdb";		
		a[2][0]="fbdbdfb";
		a[2][1]="fdbdgb";		
		a[3][0]="bdfbdf";
		a[3][1]="vfdbf";		
		a[4][0]="fbdbgb";
		a[4][1]="fbcbfb";
		a[5][0]="fvfdsf";
		a[5][1]="vfsvfsvf";
		a[6][0]="fvfsvfs";		
		a[6][1]="fvsfvfs";		
			
		return a;		
			
	}
	
}
