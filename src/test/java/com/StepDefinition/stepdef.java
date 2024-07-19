package com.StepDefinition;

import java.io.IOException;


import com.PageObjectManager.POM_Manager;
import com.runnerclass.TestRunner;

import filereader.FileReaderManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef extends TestRunner{
	
	
	POM_Manager f = new POM_Manager(driver); 
	
	@Given("User Launch the Sastha Safer Application Url")
	public void user_launch_the_sastha_safer_application_url() throws IOException {
		urllaunch(FileReaderManager.FileReaderRM().geturl());
	   
	}

	@When("User Enter The From in From Field")
	public void user_enter_the_from_in_from_field() throws Exception {
		inputelement(f.getSp().getFrom(), FileReaderManager.FileReaderRM().from());
		Thread.sleep(5000);
		robot("down");
		robot("enter");
		
	   
	}

	@When("User Enter The To in To field")
	public void user_enter_the_to_in_to_field() throws Exception {
		inputelement(f.getSp().getTo(), FileReaderManager.FileReaderRM().to());
		Thread.sleep(7000);
		robot("down");
		robot("enter");
		
	   
	}

	@When("User Click The Date in Date column")
	public void user_click_the_date_in_date_column() throws Exception {
		Thread.sleep(5000);
		clickonelement(f.getSp().getDate());
		
	}

	@When("User Click The Particular Date")
	public void user_click_the_particular_date() throws Exception {
		Thread.sleep(5000);
		clickonelement(f.getSp().getDateselection());
		
	    
	}
	@When("User Click The Traveller & Cabin")
	public void user_click_the_traveller_cabin() throws Exception {
		Thread.sleep(5000);
		clickonelement(f.getSp().getTraveelerandcabin());
		
	}

	@When("User Select The No Of Passenger in Traveller & Cabin Field")
	public void user_select_the_no_of_passenger_in_traveller_cabin_field() throws Exception {
		Thread.sleep(5000);
		clickonelement(f.getSp().getPersonselect());
	  
	}

	@When("User Select The Class in Class Field")
	public void user_select_the_class_in_class_field() throws Exception {
		Thread.sleep(5000);
		clickonelement(f.getSp().getClassselect());
	   
	}

	@When("User Click The Done button")
	public void user_click_the_done_button() throws Exception {
		Thread.sleep(5000);
		clickonelement(f.getSp().getDone());
	  
	}

	@When("User Click The Search button")
	public void user_click_the_search_button() throws Exception {
		Thread.sleep(5000);
		clickonelement(f.getSp().getSearch());
	    
	}

//	
//	@When("User Select The Particuler Flight")
//	public void user_select_the_particuler_flight() throws Exception {
//		Thread.sleep(20000);
//		clickonelement(f.getSl().getSelectflight());
//	}
//
//	@When("User Enter The Email in Email Field")
//	public void user_enter_the_email_in_email_field() throws Exception {
//		Thread.sleep(5000);
//		inputelement(f.getPd().getEntEmail(), FileReaderManager.FileReaderRM().email());
//	  
//	}
//
//	@When("User Enter The Mobile Number in Mobile Number field")
//	public void user_enter_the_mobile_number_in_mobile_number_field() throws Exception{
//		Thread.sleep(5000);
//	    inputelement(f.getPd().getMobnum(), FileReaderManager.FileReaderRM().phone());
//	   
//	}
//
//	@When("User Select The Title in Title Selection Field")
//	public void user_select_the_title_in_title_selection_field()throws Exception {
//		Thread.sleep(5000);
//        clickonelement(f.getPd().getP1title());
//	   
//	}
//
//	@When("User Enter The Firstname in Firstname field")
//	public void user_enter_the_firstname_in_firstname_field()throws Exception {
//		Thread.sleep(5000);
//    	inputelement(f.getPd().getFirstname(), FileReaderManager.FileReaderRM().firstname());
//	    
//	}
//
//	@When("User Enter The Lastname in Lastname field")
//	public void user_enter_the_lastname_in_lastname_field()throws Exception {
//		Thread.sleep(5000);
//    	inputelement(f.getPd().getLastname(), FileReaderManager.FileReaderRM().lastname());
//	    
//	}
//
//	@When("User Click The Date Of Birth Column")
//	public void user_click_the_date_of_birth_column1()throws Exception {
//		Thread.sleep(5000);
//    	clickonelement(f.getPd().getDate());
//	   
//	}
//
//	@When("User Click The Left Arrow an First Time in Select Date Of Birth Purpose")
//	public void user_click_the_left_arrow_an_first_time_in_select_date_of_birth_purpose() throws Exception{
//		Thread.sleep(5000);
//    	clickonelement(f.getPd().getYearmove1());
//	}
//
//	@When("User Click The Left Arrow an Second Time in Select Date Of Birth Purpose"
//	)
//	public void user_click_the_left_arrow_an_second_time_in_select_date_of_birth_purpose()throws Exception {
//		Thread.sleep(5000);
//    	clickonelement(f.getPd().getYearmove2());
//	}
//
//	@When("User Select The Particuler Year in Date Of Birth Selection Column")
//	public void user_select_the_particuler_year_in_date_of_birth_selection_column() throws Exception{
//		Thread.sleep(5000);
//    	clickonelement(f.getPd().getYearselect());
//	}
//
//	@When("User Select The Particuler Month in Date Of Birth Selection Column")
//	public void user_select_the_particuler_month_in_date_of_birth_selection_column()throws Exception{
//		Thread.sleep(5000);
//    	clickonelement(f.getPd().getMonthselect());
//	}
//
//	@When("User Select The Particuler Day in Date Of Birth Selection Column")
//	public void user_select_the_particuler_day_in_date_of_birth_selection_column()throws Exception {
//		Thread.sleep(5000);
//    	clickonelement(f.getPd().getDateselect());
//	}
//
//	@When("User Select The Another Passanger Title in Title Selection Field")
//	public void user_select_the_another_passanger_title_in_title_selection_field()throws Exception {
//		Thread.sleep(5000);
//		clickonelement(f.getPd().getP2title());
//	}
//
//	@When("User Enter The Another Passanger Firstname in Firstname field")
//	public void user_enter_the_another_passanger_firstname_in_firstname_field()throws Exception {
//		Thread.sleep(5000);
//    	inputelement(f.getPd().getFirstname2(), FileReaderManager.FileReaderRM().firstname1());
//	  
//	}
//
//	@When("User Enter The Another Passanger Lastname in Lastname field")
//	public void user_enter_the_another_passanger_lastname_in_lastname_field() throws Exception{
//		Thread.sleep(5000);
//    	inputelement(f.getPd().getLastname2(), FileReaderManager.FileReaderRM().lastname1());
//	    
//	}
//
//	@When("User Click The  Date Of Birth Column")
//	public void user_click_the_date_of_birth_column() throws Exception{
//		Thread.sleep(5000);
//    	clickonelement(f.getPd().getDate2());
//	    
//	}
//
//	@When("User Click The Left Arrow an Third Time in Select Date Of Birth Purpose")
//	public void user_click_the_left_arrow_an_third_time_in_select_date_of_birth_purpose() throws Exception{
//		Thread.sleep(5000);
//    	clickonelement(f.getPd().getYearmove3());
//	}
//
//	@When("User Click The Left Arrow an Fourth Time in Select Date Of Birth Purpose")
//	public void user_click_the_left_arrow_an_fourth_time_in_select_date_of_birth_purpose()throws Exception {
//		Thread.sleep(5000);
//    	clickonelement(f.getPd().getYearmove4());
//	}
//
//	@When("User Select The Another Passanger Year in Date Of Birth Selection Column")
//	public void user_select_the_another_passanger_year_in_date_of_birth_selection_column()throws Exception {
//		Thread.sleep(5000);
//    	clickonelement(f.getPd().getYearselect2());
//	}
//
//	@When("User Select The Another Passanger Month in Date Of Birth Selection Column")
//	public void user_select_the_another_passanger_month_in_date_of_birth_selection_column()throws Exception {
//		Thread.sleep(5000);
//		clickonelement(f.getPd().getMonthselect2());
//	}
//
//	@When("User Select The Another Passanger Day in Date Of Birth Selection Column")
//	public void user_select_the_another_passanger_day_in_date_of_birth_selection_column()throws Exception {
//		Thread.sleep(5000);
//    	clickonelement(f.getPd().getDateselect2());
//	    
//	}
//
//	@When("User Click Proceed To Payment button")
//	public void user_click_proceed_to_payment_button() throws Exception{
//		Thread.sleep(5000);
//    	clickonelement(f.getPd().getPayment());
//	}
//
//	
	
	
	
	

}
