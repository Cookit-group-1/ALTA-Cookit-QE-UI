@Landingprofile
Feature: Profile
    Scenario: profile
    Given User open website cookit
    When Click sign in button
    And Input username "Abdicapstone23"
    And Input password "Syiarislam1994"
    And CLick login button
    And User already login
    When User drop down feature profile
    And User click feature profile
    And User click edit profile button
    And User input bio "Alterra Luar Biasa"
    And User input current password "Syiarislam1994"
    When User click icon eye button can see current password
    And User input new password "Syiarislam1995"
    When User click icon eye button can see new password
    And User confirm new password "Syiarislam1995"
    When User click icon eye button can see confirm new password
    And User upload photo profile
    And User click request to be verified
    And User click button save

    Scenario Outline: Edit profile invalid input
        Given User open website cookit
        When Click sign in button
        And Input username "Abdicapstone23"
        And Input password "Syiarislam1995"
        And CLick login button
        And User already login
        When User drop down feature profile
        And User click feature profile
        And User click edit profile button
        And User input bio "<Bio>"
        And User input current password "<Password>"
        When User click icon eye button can see current password
        And User input new password "<New Password>"
        When User click icon eye button can see new password
        And User confirm new password "<Confirm>"
        When User click icon eye button can see confirm new password
        And User click request to be verified
        And User click button save
        Examples:
            | Bio          | Password | New Password | Confirm |
            | -Capstone QA | hah1     | qww          | qww     |
            | -Super keren | wk       | wuw x        | wuw x   |




