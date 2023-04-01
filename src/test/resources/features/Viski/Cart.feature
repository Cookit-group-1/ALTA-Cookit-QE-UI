Feature: menu Cart
  Scenario: "Cart Functionality - Checklist Item"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Cart
    Then Click on Checklist Item

  Scenario: "Cart Functionality - Delete Item"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Cart
    Then Click on Delete Item button

  Scenario: "Cart Functionality - Button total Item"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Cart
    Then Click on positive button
    And Click on negative button

  Scenario: "Cart Functionality - Checkout"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Cart
    Then Click on Check out