package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickerPage {
	WebDriver driver;

	By datepickelement = By.xpath("//a[contains(text(),'Date Pickers')]");
	By datepickerText = By.xpath("//div[contains(text(),'Date Picker')]");
	By Singledatetextbox = By.id("single-input-field");
	By calenderdatapick = By.xpath("//table[@class='table-condensed']//tbody//tr[1]//td[6]");

	public DatePickerPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickdatepicker() {
		WebElement datepickbutton = driver.findElement(datepickelement);
		datepickbutton.click();

	}

	public String getTextOfDatePicker() {
		WebElement datepickerobj = driver.findElement(datepickerText);
		return datepickerobj.getText();
	}

	public void clickcalendar() {
		WebElement clickcalenderEle = driver.findElement(Singledatetextbox);
		clickcalenderEle.click();
	}

	public void datepick() {
		WebElement calenderdateEle = driver.findElement(calenderdatapick);
		calenderdateEle.click();

	}
}
