package firstdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
//		String parent = driver.getWindowHandle();//parent window address/main window
//		System.out.println(parent);
//
//
//		WebElement p = driver.findElement(By.id("tabButton"));
//		p.click();
//
//		Set<String> allWindow = driver.getWindowHandles();
//
//		System.out.println(allWindow);
//
//		for (String child : allWindow) {
//
//			if(!parent.equals(child))
//
//			{
//
//				driver.switchTo().window(child);
//
//				WebElement w = driver.findElement(By.id("sampleHeading"));
//				String t = w.getText();
//
//				System.out.println(t);
//			}
//
//		}
		
//
//		driver.switchTo().window(parent);
//
//
//
//
//
//	}
//
//}
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		WebElement s = driver.findElement(By.xpath("(//button[@class=\"btn btn-info\"])[1]"));
		s.click();
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
	   List<String> l = new ArrayList(allwindows);
	   
	   driver.switchTo().window(l.get(1));
	   
	   WebElement z = driver.findElement(By.xpath("//h1[@class=\"display-1\"]"));
	   String d = z.getText();
	   System.out.println(d);
	   
	   driver.switchTo().window(l.get(0));
	   
	   WebElement r = driver.findElement(By.xpath("//h1[text()=\"Automation Demo Site \"]"));
	   String o = r.getText();
	   System.out.println(o);
	   
	   
	   
		
		
		
	}
	
}
