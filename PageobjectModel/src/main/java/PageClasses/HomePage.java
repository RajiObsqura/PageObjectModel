package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	By logo = By.xpath("//a[@href='index.php']//img");//xpath of image

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isLogoDisplayed() {
		WebElement element = driver.findElement(logo);
		return element.isDisplayed();
	}

	public void printTitle() {
		driver.getTitle();

	}

}
