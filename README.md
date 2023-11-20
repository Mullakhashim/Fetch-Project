# Fetch-Project

This Cucumber BDD framework/project was created to complete the task of "SDET Take Home Exercise" from Fetch with JAVA as a programming language. 
This project contains pom.xml file which contains all the necessary dependencies and plugins in order to be able to run the code smoothly.

Cucumber DBB framework was choosen for the purpose of distinguinshing the plain test cases in the feature files (src/test/resouces/features) which are written with Gherkin language 
  so that business can understand what scenarios are being tested and the the actual implementation of a code is located in "java" package (src/test/java/com/fetch/tests)

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


