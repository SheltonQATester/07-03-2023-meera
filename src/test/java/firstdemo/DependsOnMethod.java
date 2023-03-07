package firstdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsOnMethod {

	WebDriver driver;

	@Test
	public void facebookLaunch()
	{

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("www.facebook.com/");

	}
	@Test(dependsOnMethods = "facebookLaunch")
	public void facebookLogin()
	{

		WebElement uname = driver.findElement(By.id("email"));
		uname.sendKeys("adfasdf");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("dfdfd");

	}


}
