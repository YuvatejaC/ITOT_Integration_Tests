# ITOT_Integration_Tests
## API and UI Automation Tests
This repo contains both the UI and API automation test framework. 
## Features
* You would require Java to be be installed in your machine run the code.
* This is a Maven build. You need Maven to be installed to build this project.
* Used Serenity and Cucumber BDD Framework
* RestAssured and Java for APIs
* Selenium and Java for UI tests
* Tets contain feature files that are easily readable tests. Just English and anyone can understand what is implemented. and these files are in ```src/test/resources/features```
* These features are linked to stepdefinitions which will not have the actual implementaion but just to know what's happening.
* The Actual implementation is in ```com/itot/cucumber/serenitySteps ```
* API tests are implemented using POJO classes for building the requests.
* And UI Tests are implemented using Page Object Model.
