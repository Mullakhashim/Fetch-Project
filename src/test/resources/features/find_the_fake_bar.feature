Feature: Finding the fake gold bar

  User Story:
  As a user, I should be able to determine the fake bar in max 2 iterations

  Scenario: Login to the task page
    Given user goes to the task page
    Then user should see the title of the task page
    Then user should see the left bowl
    Then user should see the right bowl
    Then user should see the Reset button
    Then user should see the Weigh button
    Then user should see the Result button

  Scenario: User weighs 3 bars in each bowl
    Given user puts first three bars in the left bowl
    Given user puts last three bars in the right bowl
    Then user clicks Weigh button
    Then user should see the Result of weighing and click Reset button
    Then user puts first and second of remaining three bars
    Then user clicks Weigh button second time
    Then user locates the fake bar
    Then user clicks to the bar number and sees confirmation and error messages