package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	WebDriver driver;
	

	@FindBy(id = "origin")
	private WebElement  from;
	@FindBy(id = "destination")
	private WebElement to;
	@FindBy(id = "dateNew")
	private WebElement date;
	@FindBy(id = "dateNew_1717052400000")
	private WebElement dateselection;
	@FindBy(id = "traveller")
	private WebElement traveelerandcabin;
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private WebElement personselect;
	@FindBy(xpath = "//option[text() = 'Business']")
	private WebElement classselect;
	@FindBy(xpath = "//input[@name='done']")
	private WebElement done;
	@FindBy(xpath = "//button[@name='search']")
	private WebElement search;


	
	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getDateselection() {
		return dateselection;
	}

	public WebElement getTraveelerandcabin() {
		return traveelerandcabin;
	}

	public WebElement getPersonselect() {
		return personselect;
	}

	public WebElement getClassselect() {
		return classselect;
	}

	public WebElement getDone() {
		return done;
	}

	public WebElement getSearch() {
		return search;
	}

	public SearchPage(WebDriver dr) {
		
		driver = dr;
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	
	
	
}
