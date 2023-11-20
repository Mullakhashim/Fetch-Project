# Fetch-Project

This Cucumber BDD framework/project was created to complete the task of "SDET Take Home Exercise" from Fetch with JAVA as a programming language. 
This project contains pom.xml file which contains all the necessary dependencies and plugins in order to be able to run the code smoothly.

Cucumber DBB framework was choosen for the purpose of distinguinshing the plain test cases in the feature files (src/test/resouces/features) which are written with Gherkin language 
  so that business can understand what scenarios are being tested and the the actual implementation of a code is located in "java" package (src/test/java/com/fetch/tests)

# Challenges that were addressed in this project:

  1. Found the best algorithm (minimum number of weighings for any possible fake bar position) to find the fake gold bar to be *2 weighings*.
      The algorithm weighs gold bars until a fake one is found, clicks on a fake bar number and confirms the Confirmation message. 
      Afterwards, algorithm clicks on all the real bar numbers and confirms the Error message.

  2. Created the test automation project using Java language to perform
    a. clicks on buttons (“Weigh”, “Reset”)
    b. Getting the measurement results (field between the 'bowls')
    c. filling out the bowls grids with bar numbers (0 to 8)
    d. getting a list of weighing
    e. Clicking on the gold bar number at the bottom of the website and checking for the alert message

  3. Code the algorithm from step 1 which uses a set of actions from step 2 to find the fake gold bar

# Room for improvement 
The code can be improved in many ways (which I did not implement because of time limits):
- Create 1 feature file to test 1 scenario only
- Scenarios should be smaller and easy to understand
- A better way of handling Alerts
- A better way of locating and verifying the WebElements (especially the input boxes in both bowls)

Dependencies added (see pom.xml for more info):
 - Java-Selenium
 - Cucumber io:
   cucumber JUnit,
   cucumber java

PlugIns to be installed:
 - Cucumber For Java
 - Gherkin

To run the code:
- After cloning the project and setting it up, go to "CukesRunner.java" class and run it. It will automatically pick the test scenarios to run and execute them. 

Issues that you may encounter and possible solutions:
- Issue: If you are running the code in your local machine and if your Chrome browser is newer that version 114, you might have an issue with the WebDriver Manager not being able to launch the browser.
- Possible Solution: try to downgrade your Chrome version or to update the Dependencies to be the most up to date versions 
