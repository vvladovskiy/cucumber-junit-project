@wip
Feature: As a track driver login in different ways to the Vytrack apps.
  User Story: As a truck driver, user should be able to access all vehicle information
  grid page.
#Hardcoded
  @login1
  Scenario: Login as track driver Hardcoded
    Given user is on the vytrack login page
    When user enters track driver username
    And user enters track driver password
    And user click SignIn button
    Then user is on the Vehicles page
#Parameterization
  @login2
  Scenario: Login as track driver Parameterization
    Given user is on the vytrack login page
    When user enters track driver username "user4"
    And user enters track driver password "UserUser123"
    And user click SignIn button
    Then user is on the Vehicles page

#DataTable
  @login3
  Scenario: Login as track driver DataTable
    Given user is on the vytrack login page
    When user enters track driver username.dt "username"
      | user4       |
    And user enters track driver password.dt "password"
      | UserUser123 |
    And user click SignIn button
    Then user is on the Vehicles page

#DataTable2
  @login3
  Scenario: Login as track driver DataTable
    Given user is on the vytrack login page
    When user enters track driver credentials below
      | username | user4       |
      | password | UserUser123 |
    And user click SignIn button
    Then user is on the Vehicles page

#Scenario Outline
  @login4
  Scenario Outline: Login as track driver Scenario Outline
    Given user is on the vytrack login page
    When user enters track driver username.so "<username>"
    And user enters track driver password.so "<password>"
    And user click SignIn button
    Then user is on the Vehicles page
    Examples:
      | username | password    |
      | user4    | UserUser123 |
      | user5    | UserUser124 |
#TestNG @DataProvider
  @login5
  Scenario: Login as track driver TestNG @DataProvider
    Given user is on the vytrack login page
    When user enters track driver username.dp "user4"
    And user enters track driver password.dp "UserUser123"
    And user click SignIn button
    Then user is on the Vehicles page
#Apachi POI xlsx
  @login6
  Scenario: Login as track driver JUnit Apachi POI xlsx
    Given user is on the vytrack login page
    When user enters track driver username.poi "user4"
    And user enters track driver password.poi "UserUser123"
    And user click SignIn button
    Then user is on the Vehicles page
#Configuration.properties
  @login7
  Scenario: Login as track driver Configuration.properties
    Given user is on the vytrack login page
    When user enters track driver username.conf.prop
    And user enters track driver password.conf.prop
    And user click SignIn button
    Then user is on the Vehicles page