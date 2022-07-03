package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="user-account")
	private WebElement acc;
	
	@FindBy(xpath="//a[text()='Log In']")
	private WebElement clkLogin;
	
	@FindBy(xpath="(//input[@type='email'])[1]")
	private WebElement user;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="//button[@name='dwfrm_login_login']")
	private WebElement login;
	
	@FindBy(xpath="(//button[contains(text(),'Accept all')])[1]")
	private WebElement clkCache;
	
	@FindBy(id="dwfrm_login_username_d0sbzstaudkh-error")
	private WebElement chkEmail;
	
	public WebElement getChkEmail() {
		return chkEmail;
	}

	public WebElement getAcc() {
		return acc;
	}

	public WebElement getClkLogin() {
		return clkLogin;
	}


	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	public WebElement getClkCache() {
		return clkCache;
	}

}
