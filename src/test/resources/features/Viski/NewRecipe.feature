Feature: menu new Recipe
  Scenario: "New Recipe Functionality - Submit Recipe"
    Given User already open webstie Cookit
    When User Click Sign in
    And Click on Username Field
    Then Input Username "<RiskiFdfsadfaserdian49>"
    And Click on Password Field
    Then Input Password "<Percobaqsafsadan13>"
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
    Then Input Valid Data Ingredients sub button Step 1 Field
    And Click on Amt sub button 1 Field
    Then Input Valid Data Amt sub button Step 1 Field
    And Click on Units sub button Step 1 Field
    Then Input Valid Data Unit sub button Step 1 Field
    And Click on Ingredients add button
    And Click on Ingredients sub button 2 Field
    Then Input Valid Data Ingredients sub button Step 2 Field
    And Click on Amt sub button 2 Field
    Then Input Valid Data Amt sub button Step 2 Field
    And Click on Units sub button Step 2 Field
    Then Input Valid Data Unit sub button Step 2 Field
    And Click on Ingredients add button
    And Click on Ingredients sub button 3 Field
    Then Input Valid Data Ingredients sub button Step 3 Field
    And Click on Amt sub button 3 Field
    Then Input Valid Data Amt sub button Step 3 Field
    And Click on Units sub button Step 3 Field
    Then Input Valid Data Unit sub button Step 3 Field
    And Click on Directions add button
    And Click on Directions Step 1 Field
    Then Input Valid Data Directions Step 1 Field
    And Click on Directions add button
    And Click on Directions Step 2 Field
    Then Input Valid Data Directions Step 2 Field
    And Click on Directions add button
    And Click on Directions Step 3 Field
    Then Input Valid Data Directions Step 3 Field
    And Click on Sell Ingriedients Field
    Then Input Valid Data Sell Ingredients Field
    And Click on Submit Recipe
