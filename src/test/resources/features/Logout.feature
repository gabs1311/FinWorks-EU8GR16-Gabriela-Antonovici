Feature: Logout feature

USER STORY:
  As a logged in user I should be able to logout.

  @wip @smoke
Scenario: AC: Verify that I can logout by clicking the  button in the profile dropdown menu.
Given user is on the login page
  When user is logged in using   username "salesmanager15@info.com " and password "< salesmanager >" and clicks the loggin button
  And user clicks the dropdown profile menu
  Then user clicks the logout button



