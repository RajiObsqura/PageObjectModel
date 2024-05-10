package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.DatePickerPage;

public class DatePickerTest extends BaseClass
{
	DatePickerPage datepickerobj;
	@Test
	public void datepickertextshow()
	{
		datepickerobj=new DatePickerPage(driver);
		datepickerobj.clickdatepicker();
		datepickerobj.getTextOfDatePicker();
		System.out.println(datepickerobj.getTextOfDatePicker());
		datepickerobj.clickcalendar();
		WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='table-condensed'][1]")));
		datepickerobj.datepick();
				
	}
	/*@Test
	public void dateselectinCalender()
	{
		WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='table-condensed'][1]")));
		datepickerobj.datepick();
	}*/
	
}
