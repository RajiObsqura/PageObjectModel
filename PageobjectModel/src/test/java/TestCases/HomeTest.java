package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.HomePage;
public class HomeTest extends BaseClass
{
	
	HomePage homepage;
	
	@Test
	 	public void printLogo()
	{
		homepage=new HomePage(driver);
		System.out.println(driver.getTitle());
		homepage.isLogoDisplayed();
		homepage.printTitle();
		//Assert.assertEquals(false, null);
		Assert.assertTrue(false);
		}
}

	