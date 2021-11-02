package stepDefinitions;

import Common.DriverHandling;
import Pages.Pg01_StartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Pg01_StartPageSD extends DriverHandling{
	Pg01_StartPage obj = new Pg01_StartPage();
	
	@Given("^user opens the browser \"([^\"]*)\" and enters the URL \"([^\"]*)\" for the test case \"([^\"]*)\"$")
	public void urlNavigation(String Browser, String URL, String TCID) throws Throwable
	{
		DriverHandling.initialization(Browser, URL);
	}
	
	@Then("^clicks the start button$")
	public void clickStartButton() throws Exception
	{
		Thread.sleep(5000);
		obj.clickCookiesAccept();
		Thread.sleep(5000);
		obj.clickStartButton();
	}

}
