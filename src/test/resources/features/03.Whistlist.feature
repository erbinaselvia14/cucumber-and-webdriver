Feature: Whistlist

	#1.passed => Search Product ---------------------------------------------------------------------
	
	Scenario: Whistlist product
		When Go to website tokopedia two
		And Search product
		And Save product whistlist
		And Log in
		Then Sukses save product
