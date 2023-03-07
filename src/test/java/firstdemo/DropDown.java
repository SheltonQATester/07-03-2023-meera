package firstdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");

		//select a drop down using select class
		
//		WebElement single = driver.findElement(By.id("fruits"));
//		
//		//have to create object for select class
//		
//		
//		Select s = new Select(single);//here we have used select class and passed the web element
//		
//		
////		s.selectByIndex(0);
////		Thread.sleep(3000);
////		
////		s.selectByIndex(1);
////		
////		Thread.sleep(3000);
////		s.selectByIndex(2);
////		Thread.sleep(3000);
//		s.selectByVisibleText("Orange");
//		Thread.sleep(3000);
//		s.selectByVisibleText("Mango");
//		
//		
//		s.selectByValue("0");
		
//		WebElement s = driver.findElement(By.id("fruits"));
//		Select d = new Select(s);
//		d.selectByIndex(0);
//		d.selectByIndex(1);
//		d.selectByIndex(2);
//		d.selectByIndex(3);
//		d.selectByIndex(4);
//		d.selectByIndex(5);
//		
//		
//		d.selectByVisibleText("Apple");
//		d.selectByVisibleText("Mango");
//		d.selectByVisibleText("Orange");
//		d.selectByVisibleText("Pine Apple");
//		
//		d.selectByValue("4");
//		d.selectByValue("3");
//		d.selectByValue("2");
//		
//		WebElement multi = driver.findElement(By.id("superheros"));
//		
//		
//		Select m = new Select(multi);
//		
//		
//		m.selectByIndex(1);
//		
//		m.selectByIndex(2);
//		
//		m.selectByIndex(3);
//		
//		m.selectByIndex(4);
//		
//		Thread.sleep(3000);
//		
//		m.deselectByIndex(4);
//		
//		m.deselectByIndex(3);
//		
//		m.deselectByIndex(2);
//		
//		m.deselectByIndex(1);
//		
//		Thread.sleep(3000);
//		
//		
//		//getOptions
//		
//		
//		List<WebElement> o = m.getOptions();
//		
//		
//		for (WebElement i : o) {
//			
//			
//			System.out.println(i.getText());

		
		WebElement q = driver.findElement(By.id("superheros"));
		Select v = new Select(q);
		
		v.selectByIndex(3);
		v.selectByIndex(2);
		v.selectByIndex(5);
		Thread.sleep(3000);
		
		v.deselectByIndex(3);
		v.deselectByIndex(2);
		v.deselectByIndex(5);
		
		List<WebElement> b = v.getAllSelectedOptions();
		
		for (WebElement t:b)
		{
			System.out.println(t.getText());
			
		}
	
		}
		
	}


