Feature: menu Recook
  Scenario: "Recook Functionality - Post"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Tab Recipe
    Then Click on reply button in post account user
    And Click Add your comment Field
    Then Input Valid data add your comment Field " Add your comment "
#    And Click on Add image button
#    Then Click on Post Button

  Scenario Outline: "Recook Validation - add your comment"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Tab Recipe
    Then Click on reply button in post account user
    And Click Add your comment Field
    Then Input any Add your comment Field "<TestCase>"
    Examples:
      | TestCase |
      | Abcd     |
      | 1042     |
      | !@!#     |

  Scenario: "Recook Functionality - add image button"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Add new Item
    Then Click on New Recipe
    And Click on Sell Ingredients Field
