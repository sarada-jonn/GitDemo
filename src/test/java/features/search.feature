Feature: Search and place order for vegetables

@selenium-test
Scenario: Search for items and validate results
Given User is on greencart page
When User searched for "cucumber"
Then "Cucumber" results are displayed
