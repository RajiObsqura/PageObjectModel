package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputHomePage {
	WebDriver driver;
	By inputhome = By.xpath("(//a[@class='nav-link'])[2]");
	By showmessagebutton = By.xpath("//button[@id='button-one']");
    By singleinputfeild=By.xpath("//div[contains(text(),'Single Input Field')]");
    By getTotalButton=By.id("button-two");
    
   
    
	public InputHomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	/* public String gettotalbutton()
	    {
		 WebElement button2=driver.findElement(getTotalButton);
		 //return button2.getCssValue(button2);
		  
				 }*/
	public String singleInputFeildText()
	{
		WebElement singleInput=driver.findElement(singleinputfeild);
		return singleInput.getText();
		
	}

	public String getShowMessageButton() {
		WebElement showMessage = driver.findElement(showmessagebutton);
		return showMessage.getText();

	}

	public void clickoninputForm() {
		WebElement clickInput = driver.findElement(inputhome);
		clickInput.click();

	}
}
