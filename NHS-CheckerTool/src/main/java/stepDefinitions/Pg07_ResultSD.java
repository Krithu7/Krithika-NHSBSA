package stepDefinitions;

import Pages.Pg07_ResultPage;
import io.cucumber.java.en.Then;

public class Pg07_ResultSD {
	Pg07_ResultPage obj = new Pg07_ResultPage();
	
	@Then("^gets the result for the test case \"([^\"]*)\"$")
	public void getResult(String TCID) throws Exception
	{
		obj.captureResult();
	}

}
