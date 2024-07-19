package com.runnerclass;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Base.baseclass1;

import filereader.FileReaderManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\featurefile\\featurefile.feature", 
glue = "com.StepDefinition",monochrome = true,
dryRun = false,
tags =  "@tag1",plugin = {"html:htmlReportFolder/htmlreport.html","pretty"})

public class TestRunner extends baseclass1 {
	
		
	@BeforeClass
	public static void setup() throws IOException {
		
		browserlaunch(FileReaderManager.FileReaderRM().getbrowser());
	
	
	}
	
	
	    
	
//	@AfterClass
//	public static void closemethod () {
//		
//		close();
//	}   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public static void main(String[] args) throws Exception {
//		
//		browserlaunch(FileReaderManager.FileReaderRM().getbrowser());
//		
//		waitmethod(10);
//
//		urllaunch(FileReaderManager.FileReaderRM().geturl());
//
//		inputelement(f.getSp().getFrom(), FileReaderManager.FileReaderRM().from());
//		Thread.sleep(5000);
//		robot("down");
//		robot("enter");
//		Thread.sleep(5000);
//		inputelement(f.getSp().getTo(), FileReaderManager.FileReaderRM().to());
//		Thread.sleep(7000);
//		robot("down");
//		robot("enter");
//		Thread.sleep(5000);
//		clickonelement(f.getSp().getDate());
//		Thread.sleep(5000);
//		clickonelement(f.getSp().getDateselection());
//		Thread.sleep(5000);
//		clickonelement(f.getSp().getTraveelerandcabin());
//		Thread.sleep(5000);
//		clickonelement(f.getSp().getPersonselect());
//		Thread.sleep(5000);
//		clickonelement(f.getSp().getClassselect());
//		Thread.sleep(5000);
//		clickonelement(f.getSp().getDone());
//		Thread.sleep(5000);
//		screenshot("searchpage1");
//		Thread.sleep(5000);
//		clickonelement(f.getSp().getSearch());
//		
//		
////        screenshot("flightselection1");
////		Thread.sleep(20000);
////		clickonelement(f.getSl().getSelectflight());
////		Thread.sleep(5000);
////
////		inputelement(f.getPd().getEntEmail(), FileReaderManager.FileReaderRM().email());
////		Thread.sleep(5000);
////		inputelement(f.getPd().getMobnum(), FileReaderManager.FileReaderRM().phone());
////		Thread.sleep(5000);
////		clickonelement(f.getPd().getP1title());
////		Thread.sleep(5000);
////		inputelement(f.getPd().getFirstname(), FileReaderManager.FileReaderRM().firstname());
////		Thread.sleep(5000);
////		inputelement(f.getPd().getLastname(), FileReaderManager.FileReaderRM().lastname());
////		Thread.sleep(5000);
////		clickonelement(f.getPd().getDate());
////		Thread.sleep(5000);
////		clickonelement(f.getPd().getYearmove1());
////		Thread.sleep(5000);
////		clickonelement(f.getPd().getYearmove2());
////		Thread.sleep(5000);
////		clickonelement(f.getPd().getYearselect());
////		Thread.sleep(5000);
////		clickonelement(f.getPd().getMonthselect());
////		Thread.sleep(5000);
////		clickonelement(f.getPd().getDateselect());
////		Thread.sleep(5000);
////
////		clickonelement(f.getPd().getP2title());
////		Thread.sleep(5000);
////		inputelement(f.getPd().getFirstname2(), FileReaderManager.FileReaderRM().firstname1());
////		Thread.sleep(5000);
////		inputelement(f.getPd().getLastname2(), FileReaderManager.FileReaderRM().lastname1());
////		Thread.sleep(5000);
////		clickonelement(f.getPd().getDate2());
////		Thread.sleep(5000);
////		clickonelement(f.getPd().getYearmove3());
////		Thread.sleep(5000);
////		clickonelement(f.getPd().getYearmove4());
////		Thread.sleep(5000);
////		clickonelement(f.getPd().getYearselect2());
////		Thread.sleep(5000);
////		clickonelement(f.getPd().getMonthselect2());
////		Thread.sleep(5000);
////		clickonelement(f.getPd().getDateselect2());
////		Thread.sleep(5000);
////        screenshot("paymentproceed1");
////		Thread.sleep(5000);
////		clickonelement(f.getPd().getPayment());
////		
////		
////		clickonelement(f.getpss().getClickcard());
////		Thread.sleep(5000);
////		clickonelement(f.getpss().getPaynow());
////		Thread.sleep(5000);
////		frameweb(f.getpss().getFrame());
////		Thread.sleep(5000);
////		inputelement(f.getpss().getCardnumber(), FileReaderManager.FileReaderRM().cardnumber());
////		Thread.sleep(5000);
////        inputelement(f.getpss().getExpiry(), FileReaderManager.FileReaderRM().expiry());
////		Thread.sleep(5000);
////        inputelement(f.getpss().getCardholdername(), FileReaderManager.FileReaderRM().cardname());
////		Thread.sleep(5000);
////        inputelement(f.getpss().getCvv(), FileReaderManager.FileReaderRM().cvv());
////		Thread.sleep(5000);
////        clickonelement(f.getpss().getPaynowb());
////    	Thread.sleep(5000);
////    	clickonelement(f.getpss().getContinue());
////    	Thread.sleep(5000);
////        screenshot("donepage1");
////		
////		
////
//	}



}
