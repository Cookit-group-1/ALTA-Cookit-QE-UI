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
    Then Input Valid Data Recipe Title Field "Kue Bolu Kukus"
    And Click on Description Field
    Then Input Valid Data Description Field "Kue Favorit di pasar"
    And Click on Choose Files Photo
    And Click on Ingredients sub button First Field
    Then Input Valid Data Ingredients sub button First Field "Tepung"
    And Click on Amt sub button First Field
    Then Input Valid Data Amt sub button First Field = 1
    And Click on Units sub button First Field
    Then Input Valid Data Unit sub button First Field "gram"
    And Click on Ingredients add button
    And Click on Ingredients sub button Second Field
    Then Input Valid Data Ingredients sub button Second Field "Gula"
    And Click on Amt sub button Second Field
    Then Input Valid Data Amt sub button Second Field = 2
    And Click on Units sub button Second Field
    Then Input Valid Data Unit sub button Second Field "kilogram"
    And Click on Ingredients add button
    And Click on Ingredients sub button Third Field
    Then Input Valid Data Ingredients sub button Third Field "Butter"
    And Click on Amt sub button Third Field
    Then Input Valid Data Amt sub button Third Field = 3
    And Click on Units sub button Third Field
    Then Input Valid Data Unit sub button Third Field "gram"
    And Click on Directions add button
    And Click on Directions First Field
    Then Input Valid Data Directions First Field "Preheat oven to 350 degrees Farenheit..."
    And Click on Directions add button
    And Click on Directions Second Field
    Then Input Valid Data Directions Second Field "Combine all dry ingredients into a large bowl..."
    And Click on Directions Third Field
    Then Input Valid Data Directions Third Field "Pour into greased trays and bake for 15-20 minutes..."
    And Click on Submit Recipe

  Scenario: "New Recipe Functionality - Submit Recipe invalid input data recipe title field"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Add new Item
    Then Click on New Recipe
    And Click on Description Field
    Then Input Valid Data Description Field "Kue Favorit di pasar"
    And Click on Choose Files Photo
    And Click on Ingredients sub button First Field
    Then Input Valid Data Ingredients sub button First Field "Tepung"
    And Click on Amt sub button First Field
    Then Input Valid Data Amt sub button First Field = 1
    And Click on Units sub button First Field
    Then Input Valid Data Unit sub button First Field "gram"
    And Click on Ingredients add button
    And Click on Ingredients sub button Second Field
    Then Input Valid Data Ingredients sub button Second Field "Gula"
    And Click on Amt sub button Second Field
    Then Input Valid Data Amt sub button Second Field = 2
    And Click on Units sub button Second Field
    Then Input Valid Data Unit sub button Second Field "kilogram"
    And Click on Ingredients add button
    And Click on Ingredients sub button Third Field
    Then Input Valid Data Ingredients sub button Third Field "Butter"
    And Click on Amt sub button Third Field
    Then Input Valid Data Amt sub button Third Field = 3
    And Click on Units sub button Third Field
    Then Input Valid Data Unit sub button Third Field "gram"
    And Click on Directions add button
    And Click on Directions First Field
    Then Input Valid Data Directions First Field "Preheat oven to 350 degrees Farenheit..."
    And Click on Directions add button
    And Click on Directions Second Field
    Then Input Valid Data Directions Second Field "Combine all dry ingredients into a large bowl..."
    And Click on Directions Third Field
    Then Input Valid Data Directions Third Field "Pour into greased trays and bake for 15-20 minutes..."
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
    Then Input any Recipe Title Field "<TestCase>"
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
    Then Input any Description Field "<TestCase>"
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
    And Click on Ingredients sub button First Field
    Then Input any Ingredients sub button First Field "<TestCase>"
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
    And Click on Amt sub button First Field
    Then Input any Amt sub button First Field "<TestCase>"
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
    And Click on Units sub button First Field
    Then Input any Units sub button First Field "<TestCase>"
    Examples:
      | TestCase |
      | Abcd     |
      | 1042     |
      | !@!#     |

  @newrecipe
  Scenario Outline: "New Recipe Validation - Directions"
    Given User open website cookit
    When Click sign in button
    And Input username "RiskiFdfsadfaserdian49"
    And Input password "Percobaqsafsadan13"
    And CLick login button
    And User already login
    When User Click Button Add new Item
    Then Click on New Recipe
    And Click on Directions First Field
    Then Input any Directions First Field "<TestCase>"
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
    And Click on Choose Files Photo


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


