package firstdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
//		driver.manage().window().maximize();
//		
//		WebElement mouseHover = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
//		Actions a = new Actions(driver);
//		
//		a.moveToElement(mouseHover).build().perform();
//		
//		
//		WebElement order = driver.findElement(By.xpath("//span[text()='Your Orders']"));
//		
//		
//		Actions c = new Actions(driver);
//		c.contextClick(order).build().perform();
//		
		
//		WebElement mouse = driver.findElement(By.xpath("//span[text()='Prime']"));
//		Actions b = new Actions(driver);
//		
//		b.moveToElement(mouse).build().perform();
		
		
//		WebElement k = driver.findElement(By.xpath("//span[@class=\"accountUserName col-xs-12 reset-padding\"]"));
//		Actions a = new Actions(driver);
//		a.moveToElement(k).build().perform();
//		
//		
//		WebElement account = driver.findElement(By.xpath("//a[normalize-space()='Your Account']"));
//		Actions j = new Actions(driver);
//		j.contextClick(account).build().perform();
		
		
//		driver.get("https://demoqa.com/droppable/");
//		
//		driver.manage().window().maximize();
//		
//		WebElement drag = driver.findElement(By.id("draggable"));
//		
//		WebElement drop = driver.findElement(By.id("droppable"));
//		
//		
//		Actions shelton = new Actions(driver);
//		
//		
//		shelton.dragAndDrop(drag, drop).build().perform();
		
		WebElement p = driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']"));
		p.click();

//		WebElement q = driver.findElement(By.id("acceptable"));
//		WebElement h = driver.findElement(By.id("droppable"));
//		
		WebElement source = driver.findElement(By.id("acceptable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(destination)); 
		wait.until(ExpectedConditions.elementToBeClickable(destination));
		
		
		Actions w = new Actions(driver);
		
		w.dragAndDrop(source,destination).build().perform();
		
		
		
		
		
		
		
		
	}

}
