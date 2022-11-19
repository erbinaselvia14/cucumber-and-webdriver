package com.juaracoding.test.utils;

public enum TestSkenarioPalindrome {

	T1("Valid palindrome"),
	T2("Invalid palindrome");
	
	private String testName;

	TestSkenarioPalindrome(String value) {
		testName = value;
	}

	public String getTestName() {
		return testName;
	}

}
