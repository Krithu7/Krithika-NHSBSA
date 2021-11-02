package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.DriverHandling;

public class Pg07_ResultPage extends DriverHandling{
	
	public void captureResult() throws Exception
	{ 
		WebElement nhsResult = driver.findElement(By.xpath("//div[@class=\"done-panel\"]//h2"));
		System.out.println(nhsResult.getText());
		
	}

}
