@Test
  Feature: payment method
    @Test17
    Scenario: Verify BCA payment is enable
      Given User open website cookit
      When Click sign in button
      And Input username "Testing123"
      And Input password "Testing123"
      And CLick login button
      And User already login
      When User click add to chart button
      And Click add to checklist button
      And Click add to checkout button
      And Gofood delivery button can be clicked
      And Click payment options
      Then Payment method BCA can be clicked

    @Test18
    Scenario: Verify BNI payment is enable
      Given User open website cookit
      When Click sign in button
      And Input username "Testing123"
      And Input password "Testing123"
      And CLick login button
      And User already login
      When User click add to chart button
      And Click add to checklist button
      And Click add to checkout button
      And Gofood delivery button can be clicked
      And Click payment options
      Then Payment method BNI can be clicked

    @Test19
    Scenario: Verify BRI payment is enable
      Given User open website cookit
      When Click sign in button
      And Input username "Testing123"
      And Input password "Testing123"
      And CLick login button
      And User already login
      When User click add to chart button
      And Click add to checklist button
      And Click add to checkout button
      And Gofood delivery button can be clicked
      And Click payment options
      Then Payment method BRI can be clicked