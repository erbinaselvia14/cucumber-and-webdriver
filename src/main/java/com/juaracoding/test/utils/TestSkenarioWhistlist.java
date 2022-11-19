package com.juaracoding.test.utils;

public enum TestSkenarioWhistlist {

	T1("Whistlist product");
	
	private String testName;

	TestSkenarioWhistlist(String value) {
		testName = value;
	}

	public String getTestName() {
		return testName;
	}
}
