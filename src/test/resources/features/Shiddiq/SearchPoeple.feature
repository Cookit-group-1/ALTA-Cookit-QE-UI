@Test
@Followusers
Feature: Search User and follow User
  As a user i want to follow other user

  Scenario: Search User follow other users
    Given User open website cookit
    When Click sign in button
    And Input username "Testing123"
    And Input password "Testing123"
    And CLick login button
    And User already login
    When User click search button
    And User click search page
    And User click Poeple page to search
    And User input "Tim Qe Joss" as anme
    And Click the profile
    Then Follow Tim Qe Joss to be friend


  Scenario: Like recipes other user
    Given User open website cookit
    When Click sign in button
    And Input username "Testing123"
    And Input password "Testing123"
    And CLick login button
    And User already login
    And User click sign love to like


  @CommentRecipes
  Scenario: Comment recipes other user
    Given User open website cookit
    When Click sign in button
    And Input username "Testing123"
    And Input password "Testing123"
    And CLick login button
    And User already login
    And User click sign of comment to comment recipes
    And User comment recipes other user like "terima kasih gan, sangat membantu"
    And Add picture for commment from directory
    And Click submit button
    And Verify that commetn is ready uploaded








