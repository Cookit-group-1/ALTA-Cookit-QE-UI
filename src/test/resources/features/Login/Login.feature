@Login
Feature: login
  Scenario: login with valid data
    Given User open website cookit
    When Click sign in button
    And Input username "Testing123"
    And Input password "Testing123"
    And CLick login button
    And User already login
  #negative
  Scenario: login with invalid data email
    Given User open website cookit
    When Click sign in button
    And Input username "Testing123"
    And Input password "Testing123"
    And CLick login button
    #negative
  Scenario: Login password with special character
    Given User open website cookit
    When Click sign in button
    And Input username "Testing123"
    And Input password "Testing123"
    And CLick login button