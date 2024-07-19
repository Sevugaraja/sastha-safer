package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentDetails {
	
	
	WebDriver driver;
	
	@FindBy(xpath = "//label[text() = 'Debit & Credit Card']")
	private WebElement clickcard;
	@FindBy(xpath = "//a[@class=\"button\"]")
	private WebElement paynow;
	@FindBy(xpath = "//iframe[@allowtransparency='true']")
	private WebElement frame;
	@FindBy(xpath = "(//input[@type=\"tel\"])[1]")
	private WebElement cardnumber;
	@FindBy(id = "card_expiry")
	private WebElement expiry;
	@FindBy(id = "card_name")
	private WebElement cardholdername;
	@FindBy(id = "card_cvv")
	private WebElement cvv;
	@FindBy(id = "redesign-v15-cta")
	private WebElement paynowb;
	@FindBy(xpath = "(//button[text() = 'Continue'])[1]")
	private WebElement Continue;
	
	
	
	

	public WebElement getClickcard() {
		return clickcard;
	}

	public WebElement getPaynow() {
		return paynow;
	}
	
	public WebElement getFrame() {
		return frame;
	}
	

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getExpiry() {
		return expiry;
	}

	public WebElement getCardholdername() {
		return cardholdername;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getPaynowb() {
		return paynowb;
	}
	
	
	public WebElement getContinue() {
		return Continue;
	}
	
	public PaymentDetails(WebDriver de) {
		
		driver = de;
		PageFactory.initElements(driver, this);
		
	}



	

  
	

}
