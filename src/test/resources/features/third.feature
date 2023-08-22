Feature: Use background and Rules

  Rule: rule 1
    Background:
      Given browser is opened
      * login page is opened

    Scenario: scenario 1
      When user "atrostyanko@gmail.com" with password "Qwertyu_1" logged in
      Then title is "All Projects"
      And project ID is 12389

    Scenario: scenario 2
      When user "atrostyanko@gmail.com" with password "Qwertyu_2" logged in
      Then error is displayed

  Rule: rule 2
    Background:
      Given browser is opened
      * login page is opened
      * user "atrostyanko@gmail.com" with password "Qwertyu_1" logged in

    Scenario: scenario 1
      Then title is "All Projects"
      And project ID is 12389

    Scenario: scenario 2
      Then error is displayed