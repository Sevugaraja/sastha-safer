package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassangerDetails {
	
	WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement  EntEmail;
	@FindBy(id = "phone")
	private WebElement mobnum;
    @FindBy(xpath = "(//option[text() = 'Mr'])[1]" )
	private WebElement p1title;
	@FindBy(id =  "firstname_ADT1")
	private WebElement firstname;
	@FindBy(id =  "lastname_ADT1")
	private WebElement lastname;
	@FindBy(id = "dob_ADT1")
	private WebElement date;
	@FindBy(xpath = "//i[@class = 'zmdi zmdi-chevron-left']")
	private WebElement yearmove1;
	@FindBy(xpath = "//i[@class = 'zmdi zmdi-chevron-left']")
	private WebElement yearmove2;
	@FindBy(xpath = "//div[text() = '2001']")
	private WebElement yearselect;
	@FindBy(xpath = "//div[text() = 'June']")
	private WebElement monthselect;
	@FindBy(xpath = "//div[@data-value='992458800']")
	private WebElement dateselect;
	
	@FindBy(xpath = "(//option[text() = 'Mrs'])[2]")
	private WebElement p2title;
	@FindBy(id =  "firstname_ADT2")
	private WebElement firstname2;
	@FindBy(id = "lastname_ADT2")
	private WebElement lastname2;
	@FindBy(id = "dob_ADT2")
	private WebElement date2;
	@FindBy(xpath = "(//i[@class = 'zmdi zmdi-chevron-left'])[2]")
	private WebElement yearmove3;
	@FindBy(xpath = "(//i[@class = 'zmdi zmdi-chevron-left'])[2]")
	private WebElement yearmove4;
	@FindBy(xpath = "(//div[text() = '2003'])[2]")
	private WebElement yearselect2;
	@FindBy(xpath = "//div[text() = 'July']")
	private WebElement monthselect2;
	@FindBy(xpath = "//div[@data-value='1058554800']")
	private WebElement dateselect2;
	@FindBy(xpath = "//b[text() = 'Proceed to Payment ']")
	private WebElement payment;

	
	
	public WebElement getEntEmail() {
		return EntEmail;
	}

	public WebElement getMobnum() {
		return mobnum;
	}

	public WebElement getP1title() {
		return p1title;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getYearmove1() {
		return yearmove1;
	}

	public WebElement getYearmove2() {
		return yearmove2;
	}

	public WebElement getYearselect() {
		return yearselect;
	}

	public WebElement getMonthselect() {
		return monthselect;
	}

	public WebElement getDateselect() {
		return dateselect;
	}

	public WebElement getP2title() {
		return p2title;
	}

	public WebElement getFirstname2() {
		return firstname2;
	}

	public WebElement getLastname2() {
		return lastname2;
	}

	public WebElement getDate2() {
		return date2;
	}

	public WebElement getYearmove3() {
		return yearmove3;
	}

	public WebElement getYearmove4() {
		return yearmove4;
	}

	public WebElement getYearselect2() {
		return yearselect2;
	}

	public WebElement getMonthselect2() {
		return monthselect2;
	}

	public WebElement getDateselect2() {
		return dateselect2;
	}

	public WebElement getPayment() {
		return payment;
	}
	
	
	public PassangerDetails(WebDriver dri) {
		
		driver = dri;
		
		PageFactory.initElements(driver, this);
		
	}
	

}
