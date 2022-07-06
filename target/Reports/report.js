$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featureFiles/ForgotPassword.feature");
formatter.feature({
  "name": "Validate the forgot password functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "Validate the forgot Password with invalid email id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@testingforgot"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch chrome and load the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_launch_chrome_and_load_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the forgot password link",
  "keyword": "When "
});
formatter.match({
  "location": "ForgotStepDefinition.user_should_click_the_forgot_password_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should input ivalid email id",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotStepDefinition.user_should_input_ivalid_email_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the Send button",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotStepDefinition.user_should_click_the_Send_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgotStepDefinition.user_should_navigate_to_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/featureFiles/Login.feature");
formatter.feature({
  "name": "To validate the login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch chrome and load the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_launch_chrome_and_load_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Login funtionality with valid username and invalid Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@testing"
    }
  ]
});
formatter.step({
  "name": "User should pass valid username and invalid Password",
  "rows": [
    {
      "cells": [
        "sharm@gmail.com",
        "Sharmi@123",
        "jshi@gmail.com",
        "Jershi@377",
        "mani",
        "Mani@334"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_pass_valid_username_and_invalid_Password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_navigate_to_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});