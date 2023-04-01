Feature: menu new Recipe
  Scenario: "New Recipe Functionality - Submit Recipe"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Add new Item
    Then Click on New Recipe
    And Click on Recipe Title Field
    Then Input Valid Data Recipe Title Field
    And Click on Description Field
    Then Input Valid Data Recipe Title Field
    And Click on Photo Field
    And Choose one Photo
    And Click Open
    And Click on Ingredients sub button 1 Field
    Then Input Valid Data Ingredients sub button 1 Field
    And Click on Amt sub button 1 Field
    Then Input Valid Data Amt sub button 1 Field
    And Click on Units sub button 1 Field
    Then Input Valid Data Unit sub button 1 Field
    And Click on Ingredients add button
    And Click on Ingredients sub button 2 Field
    Then Input Valid Data Ingredients sub button 2 Field
    And Click on Amt sub button 2 Field
    Then Input Valid Data Amt sub button 2 Field
    And Click on Units sub button 2 Field
    Then Input Valid Data Unit sub button 2 Field
    And Click on Ingredients add button
    And Click on Ingredients sub button 3 Field
    Then Input Valid Data Ingredients sub button 3 Field
    And Click on Amt sub button 3 Field
    Then Input Valid Data Amt sub button 3 Field
    And Click on Units sub button 3 Field
    Then Input Valid Data Unit sub button 3 Field
    And Click on Directions add button
    And Click on Directions 1 Field
    Then Input Valid Data Directions 1 Field
    And Click on Directions add button
    And Click on Directions 2 Field
    Then Input Valid Data Directions 2 Field
    And Click on Directions add button
    And Click on Directions 3 Field
    Then Input Valid Data Directions 3 Field
    And Click on Sell Ingredients Field
    Then Input Valid Data Sell Ingredients Field
    And Click on Submit Recipe

  Scenario Outline: "New Recipe Validation - Recipe Title"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Add new Item
    Then Click on New Recipe
    And Click on Recipe Title Field
    Then Input any "<TestCase>"
    Examples:
      | TestCase |
      | Abcd     |
      | 1042     |
      | !@!#     |

  Scenario Outline: "New Recipe Validation - Description"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Add new Item
    Then Click on New Recipe
    And Click on Description Field
    Then Input any "<TestCase>"
    Examples:
      | TestCase |
      | Abcd     |
      | 1042     |
      | !@!#     |

  Scenario Outline: "New Recipe Validation - Ingredients"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Add new Item
    Then Click on New Recipe
    And Click on Ingredients sub button 1 Field
    Then Input any "<TestCase>"
    Examples:
      | TestCase |
      | Abcd     |
      | 1042     |
      | !@!#     |

  Scenario Outline: "New Recipe Validation - Amt"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Add new Item
    Then Click on New Recipe
    And Click on Amt sub button 1 Field
    Then Input any "<TestCase>"
    Examples:
      | TestCase |
      | Abcd     |
      | 1042     |
      | !@!#     |

  Scenario Outline: "New Recipe Validation - Units"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Add new Item
    Then Click on New Recipe
    And Click on Units sub button 1 Field
    Then Input any "<TestCase>"
    Examples:
      | TestCase |
      | Abcd     |
      | 1042     |
      | !@!#     |

  Scenario Outline: "New Recipe Validation - Directions"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Add new Item
    Then Click on New Recipe
    And Click on Directions 1 Field
    Then Input any "<TestCase>"
    Examples:
      | TestCase |
      | Abcd     |
      | 1042     |
      | !@!#     |

  Scenario Outline: "New Recipe Validation - Sell Ingredients"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Add new Item
    Then Click on New Recipe
    And Click on Sell Ingredients Field
    Then Input any "<TestCase>"
    Examples:
      | TestCase |
      | Abcd     |
      | 1042     |
      | !@!#     |

  Scenario: "New Recipe Functionality - Verify the Photo field is Upload"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Add new Item
    Then Click on New Recipe
    And Click on Photo Field

  Scenario: "New Recipe Functionality  - Ingredients add button"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Add new Item
    Then Click on New Recipe
    And Click on Ingredients add button

  Scenario: "New Recipe Functionality - Directions add button"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Add new Item
    Then Click on New Recipe
    And Click on Directions add button

  Scenario: "New Recipe Functionality - Sell Ingredients checkbox"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Add new Item
    Then Click on New Recipe
    And Click on Sell Ingredients Field


