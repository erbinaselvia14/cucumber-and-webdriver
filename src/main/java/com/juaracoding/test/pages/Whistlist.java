package com.juaracoding.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.test.drivers.DriverSingleton;

public class Whistlist {

	private WebDriver driver;
	
	public Whistlist() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Cari di Tokopedia']")
	private WebElement inputProduk;
	
	@FindBy(xpath = "//button[@aria-label='Kirimkan']")
	private WebElement buttonSearch;
	
	@FindBy(xpath = "//div[@class='css-jza1fo']//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//img[1]")
	private WebElement whislist;
	
	@FindBy(xpath = "//div[@data-wishlist='true']")
	private WebElement saveWhislist;
	
	@FindBy(xpath = "//input[@id='email-phone']")
	private WebElement txtEmail;
	
	@FindBy(xpath = "//span[normalize-space()='Selanjutnya']")
	private WebElement btnNext;
	
	@FindBy(xpath = "//input[@id='password-input']")
	private WebElement txtPass;
	
	@FindBy(xpath = "//span[@aria-label='login-button']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//div[@id='my-profile-header']//div[@class='css-lipffl']")
	private WebElement btnProfile;
	
	@FindBy(xpath = "//a[normalize-space()='Wishlist']")
	private WebElement btnWhist;
	
	@FindBy(xpath = "//span[normalize-space()='barang']")
	private WebElement txtBarang;
	
	@FindBy(xpath = "//h4[@class='css-1a4g0pw-unf-heading e1qvo2ff4']")
	private WebElement txtPermintaanGagal;
		
	public void inputTxtSeacrh(String teks) {
		this.inputProduk.sendKeys(teks);
	}
	
	public void btnSearch() {
		buttonSearch.click();
	}
	
	public void whistlistProduct() {
		whislist.click();
	}
	
	public void whistlistProductTwo() {
		saveWhislist.click();
	}
	
	public void getTxtEmail(String email) {
		this.txtEmail.sendKeys(email);
		btnNext.click();
	}
	
	public void getTxtPass(String pass) {
		this.txtPass.sendKeys(pass);
		btnLogin.click();
	}
	
	public void goToWhistlist() {
		btnProfile.click();
		btnWhist.click();
	}
	
	public String getTxtProduct() {
		return txtBarang.getText();
	}
	
	public String getTxtPermintaan() {
		return txtPermintaanGagal.getText();
	}
}
