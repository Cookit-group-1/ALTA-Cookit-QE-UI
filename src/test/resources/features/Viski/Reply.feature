@Test
Feature: menu Reply

  Scenario: "Reply Functionality - Post"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
      And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Tab Recipe
    And Click Three Point in post account user
    Then Click on reply button in post account user
    And Click Add your comment Field
    Then Input Valid data add your comment Field " Add your comment "
#    And Click add image Reply
    And Click on Choose Files Photo Reply
    And Click on Submit Reply

  @Reply
  Scenario Outline: "Reply Validation - add your comment"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Tab Recipe
    And Click Three Point in post account user
    Then Click on reply button in post account user
    And Click Add your comment Field
    Then Input any Add your comment Field "<TestCase>"
    Examples:
      | TestCase |
      | Abcd     |
      | 1042     |
      | !@!#     |

  Scenario: "Reply Functionality - add image button"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
#    //lannjut
