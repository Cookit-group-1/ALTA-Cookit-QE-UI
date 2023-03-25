@Contoh
  Feature: contoh login
    Scenario: login dengan valid data
      Given berada di landing page
      When masukan email "standard_user"
      And masukan pass "secret_sauce"
      Then pencet tombol login