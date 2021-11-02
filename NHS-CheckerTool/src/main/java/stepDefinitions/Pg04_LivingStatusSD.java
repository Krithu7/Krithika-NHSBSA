package stepDefinitions;

import Pages.Pg04_LivingStatusPage;
import io.cucumber.java.en.And;

public class Pg04_LivingStatusSD {
	Pg04_LivingStatusPage obj = new Pg04_LivingStatusPage();
	
	@And("^answers living status with partner \"([^\"]*)\" for the test case \"([^\"]*)\"$")
	public void selectLivingStatus(String livingstatus, String TCID) throws Exception
	{
		if(livingstatus.equals("Yes"))
			obj.chooseLivingStatusYes();
		else
			obj.chooseLivingStatusNo();
		
		obj.clickNextButton();
	}

}
