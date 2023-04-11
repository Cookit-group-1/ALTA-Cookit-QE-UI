@Test
@SignUp
Feature: Sign Up

  Scenario: Sign Up with valid data
    Given User open website cookit
    When Click sign in button
    And User click Sign up to Create new account
    And Input Username "Adella123"
    And Input Email "adella123@gmail.com"
    And Input Password "Adella123"
    And CLick sign up button
    And User already register




  Scenario: Verify Users
    Given User open website cookit
    When Click sign in button
    And Input username "Adella123"
    And Input password "Adella123"
    And CLick login button
    And User already login
    And Click logo profile to verify
    And Click profile to verify user
    Then Verify user has true adella