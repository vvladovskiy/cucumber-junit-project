Feature: Default

	#Step 1
	#log in to the Fleet module with valid truck driver credentials
	@B26G2-28 @B26G2-76
	Scenario: As a truck driver, user should be able to login to the Fleet module.
		@driven1
		  Scenario: Login as track driver
		    Given user is on the vytrack login page
		    When user enters track driver un "user4"
		    And user enters track driver pwd "UserUser123"
		    And user click SignIn button
		    #Then user should see fleet module