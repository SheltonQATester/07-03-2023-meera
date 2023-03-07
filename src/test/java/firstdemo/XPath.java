package firstdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();


		//		driver.get("https://www.facebook.com/");
		//		
		//		driver.manage().window().maximize();
		//		
		//		
		//		WebElement user = driver.findElement(By.xpath("//input[@aria-label=\"Email address or phone number\"]"));
		//		user.sendKeys("oranium@gmail.com");
		//		
		//		
		//		
		//		WebElement s = driver.findElement(By.xpath("//input[@aria-label=\"Password\"]"));
		//		s.sendKeys("dfdg");
		//		
		//		
		//		WebElement g = driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));
		//		g.click();
		//		



		//		driver.get("https://www.google.co.in/");
		//
		//		
		//		WebElement link = driver.findElement(By.partialLinkText("Gm"));
		//		
		//		
		//		link.click();


		//		


		//		driver.get("https://demo.automationtesting.in/Register.html");
		////		WebElement h = driver.findElement(By.linkText("//h2[text()='Register']"));
		////		System.out.println(h);
		//		
		//		WebElement Register = driver.findElement(By.xpath("//h2[text()='Register']"));
		//		String f = Register.getText();
		//		System.out.println(f);


		//		driver.get("https://demo.automationtesting.in/Register.html");
		//		
		//		driver.manage().window().maximize();
		//		WebElement box = driver.findElement(By.tagName("textarea"));
		//		box.sendKeys("Hi this is Automation Demo Site");
		//		
		//		driver.get("https://demo.automationtesting.in/Register.html");
		//		WebElement th = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
		//		th.sendKeys("ewfeg");
		//		
		//		WebElement re = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		//		re.sendKeys("rrgd");
		//		
		//		WebElement ed = driver.findElement(By.xpath("//textarea[@rows=\"3\"]"));
		//		ed.sendKeys("dsfrsg");
		//		
		//		WebElement gh = driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]"));
		//		gh.sendKeys("rgfdgs");
		//		
		//		WebElement ui = driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]"));
		//		ui.sendKeys("dfadf");



		driver.get("https://www.facebook.com/");




		//		WebElement we = driver.findElement(By.xpath("//input[@value=\"FeMale\"]"));
		//		we.click();
		//
		//		boolean fdf = we.isSelected();
		//
		//		System.out.println(fdf);
		//		
		//		Thread.sleep(3000);
		//		
		//		WebElement wq = driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		//		wq.click();
		//		
		//		boolean kjk = wq.isSelected();
		//		System.out.println(kjk);

		//		WebElement qa = driver.findElement(By.xpath("//input[@value=\"Cricket\"]"));
		//		qa.click();
		//		WebElement op = driver.findElement(By.xpath("//input[@value=\"Movies\"]"));
		//		op.click();
		//		WebElement li = driver.findElement(By.xpath("//input[@value=\"Hockey\"]"));
		//		li.click();
		//		Thread.sleep(3000);
		//		li.click();
		//		op.click();
		//		qa.click();

		//		WebElement we = driver.findElement(By.xpath("//img[@id=\"imagetrgt\"]"));
		//		boolean e = we.isDisplayed();
		//		System.out.println(e);

		//		WebElement q = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
		//		q.click();
		//		WebElement we = driver.findElement(By.xpath("//input[@placeholder=\"First name\"]"));
		//		we.sendKeys("vgfdsf");
		//		

		//		
		//		WebElement d = driver.findElement(By.xpath("(//input[@data-type=\"text\"])[2]"));
		//		d.sendKeys("grsgsf");
		//		
		//		WebElement r = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		//		r.sendKeys("grgd");
		//		
		//		WebElement p = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		//		p.sendKeys("zdfsdsdg");
		//		

		driver.findElement(By.xpath(""));



	}
}
