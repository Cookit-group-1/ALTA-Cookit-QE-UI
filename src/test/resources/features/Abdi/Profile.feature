@Landingprofile
Feature: Profile
    Scenario: profile
    Given User open website cookit
    When Click sign in button
    And Input username "Abdicapstone23"
    And Input password "Syiarislam1995"
    And CLick login button
    And User already login
    When User drop down feature profile
    And User click feature profile
    And User click edit profile button
    And User input bio "Aku seorang koki"
    And User input current password "Syiarislam1995"
    When User click icon eye button can see current password
    And User input new password "Syiarislam1994"
    When User click icon eye button can see new password
    And User confirm new password "Syiarislam1994"
    When User click icon eye button can see confirm new password
#    And User click button save

