@Test
  Feature: gofood delivery
    @Test11
    Scenario: Verify gofood delivery is enable
      Given User open website cookit
      When Click sign in button
      And Input username "Testing123"
      And Input password "Testing123"
      And CLick login button
      And User already login
      When User click add to chart button
      And Click add to checklist button
      And Click add to checkout button
      Then Gofood delivery button can be clicked

    @Test12
    Scenario: Place order with gofood delivery
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
      Then Verify subtotal shipping price is "Rp 9.000"

    @Test13
    Scenario: Verify grabfood delivery is enable
      Given User open website cookit
      When Click sign in button
      And Input username "Testing123"
      And Input password "Testing123"
      And CLick login button
      And User already login
      When User click add to chart button
      And Click add to checklist button
      And Click add to checkout button
      Then Grabfood delivery button can be clicked

    @Test14
    Scenario: Place order with grabfood delivery
      Given User open website cookit
      When Click sign in button
      And Input username "Testing123"
      And Input password "Testing123"
      And CLick login button
      And User already login
      When User click add to chart button
      And Click add to checklist button
      And Click add to checkout button
      And Grabfood delivery button can be clicked
      Then Verify subtotal shipping price is "Rp 2.000"

    @Test15
    Scenario: Verify shopeefood delivery is enable
      Given User open website cookit
      When Click sign in button
      And Input username "Testing123"
      And Input password "Testing123"
      And CLick login button
      And User already login
      When User click add to chart button
      And Click add to checklist button
      And Click add to checkout button
      Then Shopeefood delivery button can be clicked

    @Test16
    Scenario: Place order with shopeefood delivery
      Given User open website cookit
      When Click sign in button
      And Input username "Testing123"
      And Input password "Testing123"
      And CLick login button
      And User already login
      When User click add to chart button
      And Click add to checklist button
      And Click add to checkout button
      And Shopeefood delivery button can be clicked
      Then Verify subtotal shipping price is "Rp 6.000"

