@TestP
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

    @Test20
    Scenario: Place order with BCA payment
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
      And Payment method BCA can be clicked
      And Click place order button
      And Input valid password "Testing123"
      And Click conifrm button
      Then Payment method should be "BCA"

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

    @Test21
    Scenario: Place order with BNI payment
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
      And Payment method BNI can be clicked
      And Click place order button
      And Input valid password "Testing123"
      And Click conifrm button
      Then Payment method should be "BNI"

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

    @Test21
    Scenario: Place order with BRI payment
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
      And Payment method BRI can be clicked
      And Click place order button
      And Input valid password "Testing123"
      And Click conifrm button
      Then Payment method should be "BRI"