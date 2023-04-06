@Test
  Feature: Search recipe button validation
      @Test
    Scenario: Search recipe with valid data
      Given User open website cookit
      When Click sign in button
      And Input username "RiskiFdfsadfaserdian49"
      And Input password "Percobaqsafsadan13"
      And CLick login button
      And User already login
      Then User click search button

      @Test2
    Scenario: Search recipe button functionality
      Given User open website cookit
      When Click sign in button
      And Input username "RiskiFdfsadfaserdian49"
      And Input password "Percobaqsafsadan13"
      And CLick login button
      And User already login
      When User click search button
      Then System show search page

      @Test3
    Scenario: Search field validation
        Given User open website cookit
        When Click sign in button
        And Input username "RiskiFdfsadfaserdian49"
        And Input password "Percobaqsafsadan13"
        And CLick login button
        And User already login
        When User click search button
        Then User click search page

      @Test4
    Scenario: Input alphabet on search field
        Given User open website cookit
        When Click sign in button
        And Input username "RiskiFdfsadfaserdian49"
        And Input password "Percobaqsafsadan13"
        And CLick login button
        And User already login
        When User click search button
        And User click search page
        Then User can input alphabet "coba"

      @Test5
    Scenario Outline: Search recipe with alphabet
        Given User open website cookit
        When Click sign in button
        And Input username "RiskiFdfsadfaserdian49"
        And Input password "Percobaqsafsadan13"
        And CLick login button
        And User already login
        When User click search button
        And User click search page
        And User can input alphabet "<search>"
        And User click search recipe
        Then System show any recipe "<result>"
    Examples:
      | search | result       |
      | Noodle | Noodle       |
      |        | input recipe |
      | ./?@   | not found    |
