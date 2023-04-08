@Test
  Feature: make a purchase
    @Test22
    Scenario: Verify merchandise subtotal
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
      Then Subtotal should be "Rp 20.000"

    @Test23
    Scenario: Verify order total
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
      Then Order total should be "Rp 29.000"

    @Test24
    Scenario: Place order with valid password
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
      Then Already on detail purchase page

