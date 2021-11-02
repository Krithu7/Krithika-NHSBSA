package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Common.DriverHandling;

public class Pg02_CountrySelectionPage extends DriverHandling{
	
	public void chooseCountry() throws Exception
	{
		WebElement radioWales = driver.findElement(By.id("radio-wales"));
		JavascriptExecutor radio = (JavascriptExecutor) driver;
		radio.executeScript("arguments[0].click();", radioWales);
		radio.executeScript("arguments[0].checked=true",radioWales);
	}
	
	public void clickNextButton() throws Exception
	{
		WebElement nextButton = driver.findElement(By.id("next-button"));
		nextButton.click();
	}

}
