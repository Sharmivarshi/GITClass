@sanity
Feature: To validate the login functionality
Background:
Given User should launch chrome and load the Url

@testing
Scenario: Validate Login funtionality with valid username and invalid Password
When User should pass valid username and invalid Password
       |sharm@gmail.com|Sharmi@123|jshi@gmail.com|Jershi@377|mani|Mani@334|
And User should click the login button
Then user should navigate to incorrect credential page

@test
Scenario: Validate Login funtionality with invalid username and invalid Password
When User should pass invalid username and invalid Password
           |language|mobile|laptop|
           |java|vivo|hp|
           |selenium|lg|acer|
           |sql|nokia|dell|
           |oracle|Mi|lenovo|

And User should click the login button
Then user should navigate to incorrect credential page
           
@regression
Scenario Outline: Validate Login funtionality with invalid username and valid Password
When User should pass invalid username"<email>"  and valid Password"<password>"
And User should click the login button
Then user should navigate to incorrect credential page

Examples:
        |email|password|
        |sharmi|Sharmi@123|
        |saru@gmail.com|Saru@i23|
        |vijay@gmail.com|Vijay@123|
        |jershi@gmail.com|Jershi@123|