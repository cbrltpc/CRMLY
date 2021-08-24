@login
Feature: Users should be able to login

  Scenario: Login as a driver
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login


 # Scenario Outline: Login with "<userType>"
  #  Given the user logged in as "<userType>"
   # Then user able to see "more" tab

   # Examples:
   #  | userType      |
    #  | helpdesk      |
    #  | humanResource |
     # | marketing     |