Feature: Application Login

Background:
Given validate the browser
When browser is triggered
Then check if browser is started

@SmokeTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User Loginto application with user name and password
Then Home page is populated
And cards are displayed

@RegressionTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User signup with following details
| Sarada| abcd|sara.jon@gmail.com|900025787|
Then Home page is populated
And cards are displayed

@SanityTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User signup with following details
| Sarada| abcd|sara.jon@gmail.com|900025787|
Then Home page is populated
And cards are displayed

@RegressionTest
Scenario Outline: Home page default login
Given User is on Netbanking landing page
When User signup with <UserName> and <Password>
Then Home page is populated
And cards are displayed

Examples:
|UserName|Password|
|Sarada|ABC|
|Srikanth|PMD|
|Srini|Password|
|Srik|Password|
