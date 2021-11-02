package stepDefinitions;

import Pages.Pg02_CountrySelectionPage;
import io.cucumber.java.en.Then;

public class Pg02_CountrySelectionSD {
	Pg02_CountrySelectionPage obj = new Pg02_CountrySelectionPage();
	
	@Then("^the user selects the country Wales$")
	public void selectWales() throws Exception
	{
		obj.chooseCountry();
		obj.clickNextButton();
	}

}
