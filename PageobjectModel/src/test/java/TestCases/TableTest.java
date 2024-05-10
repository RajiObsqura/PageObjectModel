package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PageClasses.TableClass;
import UtilityPackage.UtilityClass;

public class TableTest extends BaseClass {
TableClass tablepage;
	
	@Test
	
	public void verifytableheader() {
		tablepage = new TableClass(driver);
		tablepage.clickOnTableLink();
		String actual=tablepage.getTableHeaderText();
		String expected ="Table with Pagination Example";
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void verifyClassattributeHeader() {
		tablepage = new TableClass(driver);
		tablepage.clickOnTableLink();
		String actualtableheaderclassattribute=tablepage.getheaderattribute();
		String expectedtableattribute="card-header";
		Assert.assertEquals(actualtableheaderclassattribute, expectedtableattribute);
		
	}
	@Test
	public void verifytablepaginationlink() {
		tablepage = new TableClass(driver);
		tablepage.clickOnTableLink();
		String actuallink=tablepage.gettablepaginationlink();
		String expectedlink="https://selenium.qabible.in/table-pagination.php";
		Assert.assertEquals(actuallink, expectedlink);
	}
	@Test
	public void verifytablenames() {
		tablepage = new TableClass(driver);
		tablepage.clickOnTableLink();
		tablepage.pringallnames();
	}
	@Test
	
	public void verifyofficename()
	{
		tablepage = new TableClass(driver);
		tablepage.clickOnTableLink();
		System.out.println(tablepage.getofficeofperson("Cedric Kelly"));
	}
}

