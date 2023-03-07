package firstdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions shelton = new ChromeOptions();
		shelton.addArguments("incognito");
		WebDriver driver = new ChromeDriver(shelton);
		driver.get("https://peopleplus.zoho.in/facctumcandidateonboarding/cp/portallogin");
		String w = driver.getCurrentUrl();
		System.out.println(w);
		String q = driver.getTitle();
		System.out.println(q);
	}
	
	
	

}
