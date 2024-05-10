package TestCases;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.DatePickerPage1;

public class DatePicker1Test extends BaseClass{
	DatePickerPage1 pickdate;
	@Test
	public void datepickheaderclick()
	{
		pickdate=new DatePickerPage1(driver);
		pickdate.clickOndateLink();
		
	}
	@Test 
	public void singleInputboxClick()
	{
		pickdate=new DatePickerPage1(driver);
		pickdate.clickOndateLink();
		pickdate.singleinputtextClick();
		
	}
	@Test
	public void verifydateselection()
	{
		pickdate=new DatePickerPage1(driver);
		pickdate.clickOndateLink();	
		pickdate.singleinputtextClick();
	}
	@Test
	public void verifyDateSelection(){
		pickdate=new DatePickerPage1(driver);
		pickdate.clickOndateLink();	
		pickdate.singleinputtextClick();
		//pickdate.choosedate();
		pickdate.usingsendkeys();
	}

}
