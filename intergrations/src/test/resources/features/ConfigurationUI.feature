Feature: Configuration Feature
  As a user I should be able to set the syncronization frequency.

  @SmokeUI
  Scenario: User Should be able to set the syncronization interval or frequency
    Given Logs into the ITOT Application
    And Navigates to Configuration page
    When Clicks of frequency dropdown
    And Selects the Frequency as 5 minutes
    And Clicks on save button
    Then The Syncronization frequency is validated