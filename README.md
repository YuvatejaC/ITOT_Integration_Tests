# ITOT_Integration_Tests
## API and UI Automation Tests
This repo contains both the UI and API automation test framework. 
## Features
* You would require Java to be be installed in your machine run the code.
* This is a Maven build. You need Maven to be installed to build this project.
* Used Serenity and Cucumber BDD Framework
* RestAssured and Java for APIs
* Selenium and Java for UI tests
* Tets contain feature files that are easily readable tests. Just English and anyone can understand what is implemented. and these files are in [```src/test/resources/features```](intergrations/src/test/resources/features)
* These features are linked to stepdefinitions which will not have the actual implementaion but just to know what's happening.
* The Actual implementation is in [```com/itot/cucumber/serenitySteps ```](intergrations/src/test/java/com/itot/cucumber/serenitySteps)
* API tests are implemented using POJO classes for building the requests.
* And UI Tests are implemented using Page Object Model.
* Please note this is just a skeleton or the framework with minimal tests implemented considering the time constraints.

## Executing Tests
* Once Java and Maven are installed.
* ```mvn clean verify``` -> Will run the entire UI and API tests together.
* ```mvn clean verify -Dcucumber.filter.tags = @TagNAme``` -> This will execute the tests related to specific tags that are mentioned in the feature file.
* [TestRunner.Java](intergrations/src/test/java/com/itot/cucumber/TestRunner.java) -> This Is the starting point of the test and you can mention the tags here as well.
* Few configurations can be made in [Hooks.java](intergrations/src/test/java/com/itot/cucumber/stepDefinitions/Hooks.java) to run the tests, like using the tags @Before, @After, etc,.
