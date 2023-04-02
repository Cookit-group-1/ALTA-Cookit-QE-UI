@Logout
Feature: Logout
  Scenario: Logout
    Given User open website cookit
    When Click sign in button
    And Input username "Abdicapstone23"
    And Input password "Syiarislam1995"
    And CLick login button
    And User already login
    When User drop down feature profile
    And User click logout
    And User click yes are you sure

