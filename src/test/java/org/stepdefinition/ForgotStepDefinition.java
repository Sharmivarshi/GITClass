package org.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseClass;
import org.utilities.ForgotPojo;
import org.utilities.LoginPojo;

import io.cucumber.java.en.*;

public class ForgotStepDefinition extends BaseClass {

	@When("User should click the forgot password link")
	public void user_should_click_the_forgot_password_link() throws AWTException {


		ForgotPojo f = new ForgotPojo();
	    clickBtn(f.getForgot());
	    
	}

	@When("User should input ivalid email id")
	public void user_should_input_ivalid_email_id() throws IOException {
		ForgotPojo f = new ForgotPojo();

		jFill(getData(1, 1), f.getForgotEmail());
		

	}

	@When("User should click the Send button")
	public void user_should_click_the_Send_button() {
		ForgotPojo f = new ForgotPojo();

		clickBtn(f.getSend());
			
	}

	@Then("User should navigate to Home page")
	public void user_should_navigate_to_Home_page() {

		ForgotPojo f = new ForgotPojo();

	    WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));

	    w.until(ExpectedConditions.elementToBeClickable(f.getHome()));
	    System.out.println("Reset Mail Sent to your Mail id Successfully");

	}

}
