@smoke
Feature: Validate the forgot password functionality
@testingforgot
Scenario: Validate the forgot Password with invalid email id
Given User should launch chrome and load the Url
When User should click the forgot password link
And User should input ivalid email id
And User should click the Send button
Then User should navigate to Home page 
