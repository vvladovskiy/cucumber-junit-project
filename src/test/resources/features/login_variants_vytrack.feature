Feature: As a track driver login in different ways to the Vytrack apps.
  User Story: As a truck driver, user should be able to access all vehicle information
  grid page.

  @login1
  Scenario: Login as track driver Hardcoded
    Given user is on the vytrack login page
    When user enters track driver username
    And user enters track driver password
    And user click SignIn button
    Then user is on the Vehicles page

  @login2
  Scenario: Login as track driver Parameterization
    Given user is on the vytrack login page
    When user enters track driver un "user4"
    And user enters track driver pwd "UserUser123"
    And user click SignIn button
    Then user is on the Vehicles page

  @login3
  Scenario: Login as track driver Data Table
    Given user is on the vytrack login page
    When user enters track driver un "user4"
    And user enters track driver pwd "UserUser123"
    And user click SignIn button
    Then user is on the Vehicles page

  @login4
  Scenario: Login as track driver Scenario Outline
    Given user is on the vytrack login page
    When user enters track driver un "user4"
    And user enters track driver pwd "UserUser123"
    And user click SignIn button
    Then user is on the Vehicles page

  @login5
  Scenario: Login as track driver TestNG @DataProvider
    Given user is on the vytrack login page
    When user enters track driver un "user4"
    And user enters track driver pwd "UserUser123"
    And user click SignIn button
    Then user is on the Vehicles page

  @login6
  Scenario: Login as track driver JUnit Apachi POI xlsx
    Given user is on the vytrack login page
    When user enters track driver un "user4"
    And user enters track driver pwd "UserUser123"
    And user click SignIn button
    Then user is on the Vehicles page

  @login7
  Scenario: Login as track driver Configuration.properties
    Given user is on the vytrack login page
    When user enters track driver un "user4"
    And user enters track driver pwd "UserUser123"
    And user click SignIn button
    Then user is on the Vehicles page