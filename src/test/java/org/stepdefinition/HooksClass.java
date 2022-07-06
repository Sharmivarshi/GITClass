package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	@Before(order=1)
	public void beforeScenario() {

		System.out.println("BEFORE HOOKS");	
        launchChrome();
        winMax();
    	loadUrl("https://www.coastfashion.com/");

	}
	
	@Before(order=2)
	public void secondBefore() {
	
		LoginPojo l = new LoginPojo();
        clickBtn(l.getClkCache());
		moveToElement(l.getAcc());
		moveToElement(l.getClkLogin());
		jsClick(l.getClkLogin());

	}
	@After(order=3)
	public void thirdAfter(Scenario s) throws IOException {

		String name = s.getName();
		String fileName = name.replace(" ", "_");
		screenshot(fileName);	

		
	}
	@After(order=1)
	public void firstAfter() {
		
		winClose();

		System.out.println("AFTER HOOKS");
		
	
		}
	
	@After(order=2)
	public void afterScnario(Scenario s) throws IOException {

		if (s.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] screen = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screen, "image/png");
		}
		System.out.println("Program Tested Successfully");
		
		

	}
}
