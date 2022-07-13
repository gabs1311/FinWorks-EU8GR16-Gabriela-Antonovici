Feature: Login feature


  Scenario Outline: Verify that I can login with valid credentials.
    Given  user is on the login page
    When user enters username "<userName>"
    And user enters password "<password>"
    And user clicks the login button
    Then user should see the dashboard



    Examples: valid credentials
    |userType|userName|password|
    |Sales manager|salesmanager15@info.com|salesmanager|
