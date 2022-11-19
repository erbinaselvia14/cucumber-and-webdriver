Feature: Seacrh Teks

	#1.passed => Search Product ---------------------------------------------------------------------
	
	Scenario: Search product
		When Go to website tokopedia
		And Input product
		And Scroll page
		Then Get information product