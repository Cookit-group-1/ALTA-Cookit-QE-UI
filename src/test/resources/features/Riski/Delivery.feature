@Test
  Feature: gofood delivery
    Scenario: Verify gofood delivery is enable
      Given User open website cookit
      When Click sign in button
      And Input username "RiskiFdfsadfaserdian49"
      And Input password "Percobaqsafsadan13"
      And CLick login button
      And User already login
      When User click add to chart button
      And Click add to checklist button
      And Click add to checkout button
      Then Gofood delivery button can be clicked