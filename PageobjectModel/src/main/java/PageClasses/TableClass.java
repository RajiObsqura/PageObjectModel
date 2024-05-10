package PageClasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityPackage.UtilityClass;

public class TableClass {
	WebDriver driver;
	UtilityClass utilityclass=new UtilityClass();
	
	@FindBy(xpath ="(//a[contains(text(),'Table')])[1]" )
	WebElement tablelink;
	
	@FindBy(xpath ="(//div[@class='card-header'])[2]" )
	WebElement tableheader;
	
	@FindBy(xpath ="//a[text()='Table with Pagination']")
	WebElement tablepaginationlink;
	
	@FindBy(xpath ="//a[@class='nav-link']")
	List<WebElement> listnames;
	
	/*@FindBy(xpath ="//table//tr[4]//td[3]")
	List<WebElement> listUser;*/
	
	public TableClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//initelements- static and initialize webelement and for all webelements
		
	}
	
	public void clickOnTableLink() {
		tablelink.click();
		
	}
	public String getTableHeaderText() {
		String tableheadertext=tableheader.getText();
		return tableheadertext;
	}
	public String getheaderattribute() {
		return utilityclass.get_attribute(tableheader, "class");
	}
	public String gettablepaginationlink() {
		return utilityclass.get_attribute(tablepaginationlink, "href");
	}
	public void pringallnames() {
		List<String> namesData = new ArrayList<String>();
		namesData=utilityclass.gettextofelements(listnames);
		System.out.println(namesData);
	}

	
	public String getofficeofperson(String name) {
		int index=0;
		List<String> namesData = new ArrayList<String>();
		namesData = utilityclass.gettextofelements(listnames);
		for(index=0;index<namesData.size();index++)
		{
		if(namesData.get(index).equals(name)) {
		index++;
		break;
		}
		}
		WebElement officeelement=driver.findElement(By.xpath("//table//tr["+index+"]//td[3]"));
		return officeelement.getText();
		}
}




