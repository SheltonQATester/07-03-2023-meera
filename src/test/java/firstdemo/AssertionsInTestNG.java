package firstdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsInTestNG {
	
	
	@Test
	public void demoAssert()
	{
		
		
		String s1="Shelton";
		
		String s2="Datson";
		
		System.out.println("Hi this is Shelton");
		
		
		//HardAssert
		
		//Assert.assertNotEquals(s1, s2);
		
		Assert.assertEquals(s1, s2,"Both the Strings are not Equals");//terminate
		
		System.out.println("Hi myself shelton doing Testing Job @ Google");
		
	}
	
	@Test
	public void softAssert()
	{
		
		
		String s3="Chrompet";
		String s4="Velachery";
		
		
		// SoftAssert j = new SoftAssert();
		
		SoftAssert s = new SoftAssert();
		
		System.out.println("Hi this is Soft Assert");
		
		
		s.assertEquals(s3, s4);
		
		System.out.println("Soft Assert Execute even though condition fails");
		
		
		s.assertAll();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
