package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.InputHomePage;

public class InputFormclass extends BaseClass {
	
	InputHomePage inputhomepage;
	@Test
public void verifyShowMessageTerxt()
{
	inputhomepage=new InputHomePage(driver);
	inputhomepage.clickoninputForm();
	inputhomepage.getShowMessageButton();
	/*String actual =inputhomepage.getShowMessageButton();
	String expected="Show Message";
	Assert.assertEquals(actual,expected);*/
	inputhomepage.singleInputFeildText();
	
		String actual1=inputhomepage.singleInputFeildText();
		String expected1="Single Input Field";
		Assert.assertEquals(actual1, expected1);
		System.out.println(inputhomepage.singleInputFeildText());
		//inputhomepage.gettotalbutton();
		
	
}
public void verifySingleInputboxText()
{
	inputhomepage=new InputHomePage(driver);
	inputhomepage.clickoninputForm();
	//inputhomepage.singleInputFeildText();
	System.out.println(inputhomepage.singleInputFeildText());
	String actual1=inputhomepage.singleInputFeildText();
	String expected1="Single Input Field";
	Assert.assertEquals(actual1, expected1);
	
	
}
}
