package com.juaracoding.test.polindrome_test;

import java.util.Scanner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestPalindrome {

	private String teks;
	private String temp;
	private Scanner input;
	private Scanner input2;
	

	@Given("Input string kakak")
	public void input_string_kakak() {
		input2 = new Scanner(System.in);
		System.out.print("Masukan Teks : ");
		
		teks = input2.nextLine();
		System.out.println("Inputan Teks adalah " + teks);	
	}
	
	@When("Test for palindrome")
	public void test_for_palindrome() {
		temp = "";
		for(int i=teks.length()-1; i>=0; i--) {
			char chr = teks.charAt(i);
			temp += String.valueOf(chr);
		}
	}
	
	@Then("Result true")
	public void result_true(){
		if(teks.toLowerCase().equals(temp.toLowerCase())) {
			System.out.println();
			System.out.println(teks + " Adalah Teks Palindrome");
		}else {
			System.out.println();
			System.out.println(teks + " Adalah Bukan Teks Palindrome");
		}
	}
	
	// invalid Palindrome ---------------------------------------------
	
	@When("Input string ibu")
	public void input_string_ibu() {
		input = new Scanner(System.in);
		System.out.print("Masukan Teks : ");
		
		teks = input.nextLine();
		System.out.println("Inputan Teks adalah " + teks);
	}
	
	@And("Test for palindrome two")
	public void test_for_palindrome_two() {
		temp = "";
		for(int i=teks.length()-1; i>=0; i--) {
			char chr = teks.charAt(i);
			temp += String.valueOf(chr);
		}
	}
	
	@Then("Result false")
	public void result_false() {
		if(teks.toLowerCase().equals(temp.toLowerCase())) {
			System.out.println();
			System.out.println(teks + " Adalah Teks Palindrome");
		}else {
			System.out.println();
			System.out.println(teks + " Adalah Bukan Teks Palindrome");
		}
	}	
}
