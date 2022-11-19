package com.juaracoding.test.utils;

public enum TestSkenarioSearch {

	T1("Search product");
	
	private String testName;

	TestSkenarioSearch(String value) {
		testName = value;
	}

	public String getTestName() {
		return testName;
	}

}
