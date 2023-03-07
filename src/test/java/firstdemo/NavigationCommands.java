package firstdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
//        
//        driver.navigate().to("https://www.naukri.com");
//        
//		driver.navigate().to("https://www.synechron.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		
        
        driver.get("https:facebook.com");
        
        driver.manage().window().maximize();
        
        String o = driver.getCurrentUrl();// to get the url
        
        System.out.println(o);
        
        
        //to get the title of the browser
        
        
        String shelton = driver.getTitle();
        
        System.out.println(shelton);
	}

}
