package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickerPage1 {
	WebDriver driver;
	
	@FindBy(xpath=("//a[contains(text(),'Date Pickers')]"))
	WebElement datepick;
	
	@FindBy(xpath=("//input[@id='single-input-field']"))
	WebElement singleinput;
	
	@FindBy(xpath=("(//th[@class='datepicker-switch'])[1]"))
	WebElement calendarday;
	
	@FindBy(xpath=("//th[@class='next']"))
	WebElement nextbutton;
	
	@FindBy(xpath=("//th[@class='prev']n"))
	WebElement calenderPrebutton;
	
	
	
	/*@FindBy(xpath=("//table[@class='table-condensed']//tbody//tr[1]//td[6]"))
	WebElement todaydate;*/
	
	
	
	public DatePickerPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//initelements- static and initialize webelement and for all webelements
		
	}
	
	public void clickOndateLink() 
	{
		datepick.click();
    }
	public void singleinputtextClick()
	{
		singleinput.click();
		
	}
	public void usingsendkeys()
	{
		singleinput.sendKeys("05/04/2024");
	}
	public void choosedate()
	{
		String date="15-08-2024";
		String split[]=date.split("-");
		String year=split[2];
		String day=split[0];
		String monthIndex=split[1];
		int monthNumber=Integer.parseInt(monthIndex);
		int yearNumber=Integer.parseInt(year);
		String month="";
		switch (monthNumber) {
		case 01:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
	}
		String month_year=month+" "+year;
		while(true)
		{
			String current_month_year=singleinput.getText();
			
			if(month_year.equals(singleinput))
			{
				break;
				
			}
			else
		
				if(yearNumber>2024)
					nextbutton.click();
			{
			else if(monthNumber<5 && yearNumber <2024)
				{
					calenderPrebutton.click();
					
				}
			}
			
			
		}
		WebElement calenderdayelement=driver.findElement(By.xpath("//tbody//td[text()='"+day+"' and @class='day']"));
		calenderdayelement.click();
		todaydate.click();
		}
}


