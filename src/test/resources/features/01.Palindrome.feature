Feature: Palindrome Teks

	#1.passed => valid Palindrome ---------------------------------------------------------------------
	
	Scenario: Valid palindrome
		Given Input string kakak
		When Test for palindrome
		Then Result true
	
	#2.failed => invalid Palindrome ---------------------------------------------------------------------
		
	Scenario: Invalid palindrome
		When Input string ibu
		And Test for palindrome two
		Then Result false
