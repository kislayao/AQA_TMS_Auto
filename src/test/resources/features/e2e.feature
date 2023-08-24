Feature: E2E test

  Scenario: User byes 1 item
    Given start browser
    * open login page
    When user logged in with username standard_user and password secret_sauce
    * user added item to the cart
    * user opens the cart
    * user see added product on the opened page
    * user clicks checkout
    * user fills in first name Olga last name Kislaya and postal code 3476
    * user clicks continue checkout
    * user see added product on the opened page
    Then user finishes checkout
    * complete checkout page is displayed




