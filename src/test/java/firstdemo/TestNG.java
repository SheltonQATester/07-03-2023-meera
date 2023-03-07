package firstdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG{
	
	
	
//	@Test(priority = 0)
//	public void orange()//testcase
//	{
//		
//		
//		System.out.println("this is orange");
//	}
//	@Test(priority = 2)
//	public void apple()
//	{
//		
//		System.out.println("this is apple");
//	}
//
//	@Test(priority = -1)
//	public void pinapple()
//	{
//		
//		
//		System.out.println("pinapple");
//	}
	@Test(priority = 3,groups = "smoke",enabled = false)
public void amazon()
{
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4qsiujpf5j_e&adgrpid=60456322738&hvpone=&hvptwo=&hvadid=486393568006&hvpos=&hvnetw=g&hvrand=8482948949339249110&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061909&hvtargid=kwd-360364908477&hydadcr=14451_2154369&gclid=Cj0KCQiAutyfBhCMARIsAMgcRJR2Yg8RoolvNXTkpLEMy2pW4ToC42MUQxChyNezpiVzqv6qy8qlEbsaAhHmEALw_wcB");
}
   @Test(priority =1,enabled = false)
  public void flipkart()
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  
  }
   @Test(priority= 2, groups = "smoke", enabled = false)
		 
 public void snapdeal ()
 {
	 WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	 driver.get("https://www.snapdeal.com/?utm_source=admitad_846&utm_campaign=f2629753856f7f0fc68296d44f3f761a&utm_content=admitad_846&publisher_id=586854");
	 
 }
 @Test(priority= 4) 
 public void facebook()
 {
	 
	 WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	
 }
 
}
