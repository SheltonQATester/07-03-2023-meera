package firstdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement s = driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
		s.click();
		
//		Alert shelton = driver.switchTo().alert();
//		
//		String m = shelton.getText();
//		System.out.println(m);
//		shelton.accept();
		
		
		
		
		
		
		
		
		
		
		
	}

}
