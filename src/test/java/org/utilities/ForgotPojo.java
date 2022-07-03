package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPojo extends BaseClass{

	public ForgotPojo() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Forgot')]")
	private WebElement forgot;
	
    @FindBy(xpath="//input[@id='dwfrm_requestpassword_email']")
//	@FindBy(className="password-reset")
	private WebElement forgotEmail;
	
	@FindBy(xpath="//a[@class='homepage-link']")
	private WebElement home;
	
	@FindBy(className="reset-password-btn")
	private WebElement send;

	public WebElement getForgot() {
		return forgot;
	}

	public WebElement getForgotEmail() {
		return forgotEmail;
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getSend() {
		return send;
	}

}
