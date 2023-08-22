Feature: Parameterized tests

  Scenario: Parameterization of steps
    Given browser is opened
    * login page is opened
    When user "atrostyanko@gmail.com" with password "Qwertyu_1" logged in
    Then title is "All Projects"
    And project ID is 12389

  Scenario: Parameterization with RegEx
    Given browser is opened
    * login page is opened
    When admin atrostyanko@gmail.com with password "Qwertyu_1" logged in
    Then title is "All Projects"
    And project ID is 1238
    And all elements "are" visible

  Scenario Outline: Parameterization using the table of values
    Given browser is opened
    * login page is opened
    When admin <username> with password "<password>" logged in
    Then project ID is <prID>
    Examples:
      | username                | password  | prID   |
      | atrostyanko@gmail.com   | Qwertyu_1 | 656465 |
      | atrostyanko+1@gmail.com | Qwertyu_2 | 6565   |

  Scenario: Step parameterization
    Given browser is opened
    * login page is opened
    When user logged in
      | username | atrostyanko@gmail.com |
      | password | Qwertyu_1             |
    Then title is "All Projects"
    And project ID is 1238


