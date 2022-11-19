package com.juaracoding.test.whistlist;

import org.openqa.selenium.WebDriver;

import com.juaracoding.test.pages.Whistlist;
import com.juaracoding.test.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testwhistlist {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private Whistlist list = new Whistlist();
	
	public Testwhistlist() {
		driver = HooksWhistlist.driver;
		extentTest = HooksWhistlist.extentTest;
	}
	
	@When("Go to website tokopedia two")
	public void go_to_website_tokopedia_two() {
		driver.get(Constants.URL_ONE);
		HooksWhistlist.delay(3);
		extentTest.log(LogStatus.PASS, "Go to website tokopedia");
	}
	
	@And("Search product")
	public void search_product() {
		HooksWhistlist.delay(5);
		list.inputTxtSeacrh("Baju");
		HooksWhistlist.delay(5);
		list.btnSearch();
		HooksWhistlist.delay(5);
		extentTest.log(LogStatus.PASS, "Search product");
	}
	
	@And("Save product whistlist")
	public void save_product_whistlist() {
		HooksWhistlist.scroll(250);
		list.whistlistProduct();
		HooksWhistlist.delay(5);
		list.whistlistProductTwo();
		extentTest.log(LogStatus.PASS, "Save product whistlist");
	}
	
	@And("Log in")
	public void log_in() {
		list.getTxtEmail("imutpanda149@gmail.com");
		HooksWhistlist.delay(5);
		list.getTxtPass("111111");
		HooksWhistlist.delay(5);
		extentTest.log(LogStatus.PASS, "Log in");
	}
	
	@Then("Sukses save product")
	public void sukses_save_product() {
//		HooksWhistlist.delay(2);
//		list.goToWhistlist();
//		HooksWhistlist.scroll(50);
//		System.out.println(list.getTxtProduct());
		System.out.println(list.getTxtPermintaan());
		extentTest.log(LogStatus.PASS, "Sukses save product");
	}
}
