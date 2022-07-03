package org.stepdefinition;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass{
	//There were undefined steps. You can implement missing steps with the snippets below:

		@Given("User should launch chrome and load the Url")
		public void user_should_launch_chrome_and_load_the_Url() {
//	        launchChrome();
//	        winMax();
//	    	loadUrl("https://www.coastfashion.com/");
//
//			LoginPojo l = new LoginPojo();
//	        clickBtn(l.getClkCache());
//
//			moveToElement(l.getAcc());
//			moveToElement(l.getClkLogin());
//			jsClick(l.getClkLogin());

		}

//		@When("User should pass valid username and invalid password")
//		public void user_should_pass_valid_username_and_invalid_password() throws IOException {
//			LoginPojo l = new LoginPojo();
//			fill(l.getUser(), getData(1, 1));
//			fill(l.getPass(), getData(1, 2));
//			
//
//		}

		@When("User should click the login button")
		public void user_should_click_the_login_button() {
			LoginPojo l = new LoginPojo();

			clickBtn(l.getLogin());

		}
		
		@Then("user should navigate to incorrect credential page")
		public void user_should_navigate_to_incorrect_credential_page() throws InterruptedException  {
			Thread.sleep(1000);
			LoginPojo l = new LoginPojo();

			String cur = driver.getCurrentUrl();
			System.out.println(cur);
			String userVal = l.getUser().getAttribute("value");
			System.out.println(userVal);
			Thread.sleep(3000);
			if (userVal.contains("@")) {
				Assert.assertTrue("Please check the url", cur.contains("login-form"));	

			} else {

				System.out.println("Enter Your Mail id Correct Format");
			}
		}
			

			@When("User should pass valid username and invalid Password")
			public void user_should_pass_valid_username_and_invalid_Password(io.cucumber.datatable.DataTable d) {
				
				List<String> li = d.asList();
				LoginPojo l = new LoginPojo();
				fill(l.getUser(), li.get(2));
				fill(l.getPass(), li.get(1));

			}

			@When("User should pass invalid username and invalid Password")
			public void user_should_pass_invalid_username_and_invalid_Password(io.cucumber.datatable.DataTable ds) {
				List<Map<String, String>> mp = ds.asMaps();
				LoginPojo l = new LoginPojo();

				fill(l.getUser(), mp.get(0).get("language"));
			
				
			}

			@When("User should pass invalid username{string}  and valid Password{string}")
			public void user_should_pass_invalid_username_and_valid_Password(String s1, String s2) {
  
				LoginPojo l = new LoginPojo();
				fill(l.getUser(), s1);
				fill(l.getPass(), s2);

			}



}
