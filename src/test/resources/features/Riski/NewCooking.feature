@Test
  Feature: New cooking
    @Test6
    Scenario: Verify new cooking button is enable
      Given User open website cookit
      When Click sign in button
      And Input username "RiskiFdfsadfaserdian49"
      And Input password "Percobaqsafsadan13"
      And CLick login button
      And User already login

    @Test7
    Scenario: Verify function of new cooking button
      Given User open website cookit
      When Click sign in button
      And Input username "RiskiFdfsadfaserdian49"
      And Input password "Percobaqsafsadan13"
      And CLick login button
      And User already login

    @Test8
    Scenario: input sentence on new cooking field
      Given User open website cookit
      When Click sign in button
      And Input username "RiskiFdfsadfaserdian49"
      And Input password "Percobaqsafsadan13"
      And CLick login button
      And User already login


    @Test9
    Scenario Outline: Create new cooking recipe
      Given User open website cookit
      When Click sign in button
      And Input username "RiskiFdfsadfaserdian49"
      And Input password "Percobaqsafsadan13"
      And CLick login button
      And User already login
      When User click add new item button
      And Click new cooking
      And Input any description "<description>"
      And Input an image
      Then Click submit

    Examples:
      | description |
      | Pizza       |
      |             |

    @Test10
    Scenario: Create new cooking recipe with empty data
      Given User open website cookit
      When Click sign in button
      And Input username "RiskiFdfsadfaserdian49"
      And Input password "Percobaqsafsadan13"
      And CLick login button
      And User already login
      When User click add new item button
      And Click new cooking