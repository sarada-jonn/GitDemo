Feature: Application Login
@SmokeTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User signup with following details
| Sarada| abcd|sara.jon@gmail.com|900025787|
Then Home page is populated
And cards are displayed