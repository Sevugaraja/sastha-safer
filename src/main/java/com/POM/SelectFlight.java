package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
	
	WebDriver driver;
	
	
	@FindBy(xpath = "(//span[text() ='13:20']//preceding::span[text() = '₹18603'][1]//following::button)[1]")
	private WebElement selectflight;

	public WebElement getSelectflight() {
		
		return selectflight;
	}

	public SelectFlight(WebDriver dr) {
		
		
		driver = dr;
		
		PageFactory.initElements(driver, this);
		
		
		
		
		
		
	}
	

}
