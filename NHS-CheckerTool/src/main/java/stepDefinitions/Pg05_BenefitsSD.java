package stepDefinitions;

import Pages.Pg05_BenefitsPage;
import io.cucumber.java.en.And;

public class Pg05_BenefitsSD {
	Pg05_BenefitsPage obj = new Pg05_BenefitsPage();
	
	@And("^answers benefit or tax credit question \"([^\"]*)\" for the test case \"([^\"]*)\"$")
	public void answerBenefitQn(String benefitoption, String TCID) throws Exception
	{
		if(benefitoption.equals("Yes"))
			obj.chooseBenefitsYes();
		else
			obj.chooseBenefitsNo();
		
		obj.clickNextButton();
	}

}
