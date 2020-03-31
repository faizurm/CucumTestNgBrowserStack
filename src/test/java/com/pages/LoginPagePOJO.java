package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class LoginPagePOJO extends LibGlobal{
	
	public LoginPagePOJO() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email")
	private WebElement txtUser;
	
	
	@FindBy(id="pass")
	private  WebElement txtPass;
	
	@FindBy(id="loginbutton")
	private WebElement btnLogIn;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogIn() {
		return btnLogIn;
	}
	
	

}
