package firstdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDatasPass {

	@Test(dataProvider = "shelton")
	public void facebookLogin(String s1, String d)
	{


		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();


		driver.get("https://www.facebook.com/");


		WebElement s = driver.findElement(By.xpath("//input[@type=\"text\"]"));

		s.sendKeys(s1);

		WebElement j = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		j.sendKeys(d);



		WebElement x = driver.findElement(By.xpath("//button[@value=\"1\"]"));
		x.click();

	}

	@DataProvider
	public Object[][] shelton()
	{


		Object a[][] = new Object[3][2];
		a[0][0]="Oranium@gmail.com";
		a[0][1]="pass@123";
		a[1][0]="shelton@gmail.com";
		a[1][1]="shel123";
		a[2][0]="maven@gmail.com";
		a[2][1]="mave123";
		return a;

	}




}
