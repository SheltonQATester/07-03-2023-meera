package firstdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertTest {
	@Test
	public void demoAssert()
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");

//
//		String title = driver.getTitle();
//
//		System.out.println(title);//Google
//
//		//Assert.assertEquals("Google", "Facebook");//
//
//		SoftAssert s = new SoftAssert();
//
//		s.assertEquals("Google", "Facebook");
//		System.out.println("Verified Successfully");
//
//		System.out.println("Launched Successfully");
//
//		System.out.println("Tested Successfully");
//
//		s.assertAll();// to capture the failures if exist in testcases
		
		String z = driver.getTitle();
		System.out.println(z);
		
		System.out.println("Assertion Hard Assert");
		Assert.assertEquals("facebook","facebook");//fail
		System.out.println("Hard Assertion");
		
		System.out.println("=====================>>>>>>>>>>");
		
		SoftAssert s = new SoftAssert();
		System.out.println("Hi this is Soft Assert");
		s.assertEquals("facebook", "instagram");
		System.out.println("successfully");





	}



}
