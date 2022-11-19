package com.juaracoding.test.seacrh_test;

import org.openqa.selenium.WebDriver;

import com.juaracoding.test.pages.SearchProduct;
import com.juaracoding.test.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSearch {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private SearchProduct search = new SearchProduct();
	
	public TestSearch() {
		driver = HooksSearch.driver;
		extentTest = HooksSearch.extentTest;
	}
	
	@When("Go to website tokopedia")
	public void go_to_website_tokopedia() {
		driver.get(Constants.URL_ONE);
		HooksSearch.delay(5);
		extentTest.log(LogStatus.PASS, "Go to website tokopedia");
	}
	
	@And("Input product")
	public void input_product() {
		HooksSearch.delay(5);
		search.inputTxtSeacrh("Baju");
		HooksSearch.delay(2);
		search.btnSearch();
		HooksSearch.delay(5);
		extentTest.log(LogStatus.PASS, "Input product");
	}
	
	@And("Scroll page")
	public void scroll_page() {
		HooksSearch.scroll(400);
		HooksSearch.delay(10);
		HooksSearch.scroll(400);
		HooksSearch.delay(5);
		extentTest.log(LogStatus.PASS, "Scroll page");
	}
	
	@Then("Get information product")
	public void get_information_product() {
		HooksSearch.scroll(-800);
		HooksSearch.delay(5);
		System.out.println(search.getTxtKeteranganProduk());
		extentTest.log(LogStatus.PASS, "Get information product");
	}
}
