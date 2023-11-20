Feature: Login to the task page

  User Story:
  As a user, I should be able to login to the task page


  Scenario: Login to the task page
    Given user goes to the task page
    Then user should see the title of the task page
    Then user should see the left bowl
    Then user should see the right bowl
    Then user should see the Reset button
    Then user should see the Weigh button
    Then user should see the Result button
