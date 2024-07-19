package com.PageObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.POM.PassangerDetails;
import com.POM.PaymentDetails;
import com.POM.SearchPage;
import com.POM.SelectFlight;

public class POM_Manager {
	
	
	WebDriver driver;
	
	private SearchPage sp;
	
	private SelectFlight sf;
	
	private PassangerDetails pd;
	
	private PaymentDetails pss;

	public SearchPage getSp() {
		sp = new SearchPage(driver);
		
		return sp;
	}

	public SelectFlight getSl() {
		sf = new SelectFlight(driver);

		return sf;
	}
	
	public PassangerDetails getPd() {
		pd = new PassangerDetails(driver);

		return pd;
	}
	
	
	public PaymentDetails getpss() {
		pss = new PaymentDetails(driver);

		return pss;
	}
	
	
	public POM_Manager(WebDriver gt) {
		
		driver = gt;
		PageFactory.initElements(driver, this);
		
		
		
		
	}
	
	

}
