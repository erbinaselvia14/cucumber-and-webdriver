package com.juaracoding.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.test.drivers.DriverSingleton;

public class SearchProduct {
	
	private WebDriver driver;
	
	public SearchProduct() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Cari di Tokopedia']")
	private WebElement inputProduk;
	
	@FindBy(xpath = "//button[@aria-label='Kirimkan']")
	private WebElement buttonSearch;
	
	@FindBy(xpath = "//*[@id=\"zeus-root\"]/div/div[2]/div/div[2]/div[2]/span/div")
	private WebElement txtProduct;
	
	public void inputTxtSeacrh(String teks) {
		this.inputProduk.sendKeys(teks);
	}
	
	public void btnSearch() {
		buttonSearch.click();
	}
	
	public String getTxtKeteranganProduk() {
		return txtProduct.getText();
	}
	

}
