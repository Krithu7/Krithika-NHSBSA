package stepDefinitions;

import Pages.Pg03_EnterDOBPage;
import io.cucumber.java.en.And;

public class Pg03_EnterDOBSD {
	Pg03_EnterDOBPage obj = new Pg03_EnterDOBPage();
	
	@And("^enters the DOB fields - date \"([^\"]*)\" month \"([^\"]*)\" and year \"([^\"]*)\" for the test case \"([^\"]*)\"$")
	public void enterDOB(String date, String month, String year, String TCID) throws Exception
	{
		obj.enterDate(date);
		obj.enterMonth(month);
		obj.enterYear(year);
		obj.clickNextButton();
	}

}
