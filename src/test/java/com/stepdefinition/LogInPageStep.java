package com.stepdefinition;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

import com.base.LibGlobal;
import com.pages.LoginPagePOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInPageStep extends LibGlobal{
	
	
	
	@Given("user is on facebook page")
	public void user_is_on_facebook_page() throws MalformedURLException {
		getDriverCloud();
		loadUrl("https://www.facebook.com/");
		
	   
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String s, String s2) {
	  
		WebElement txtUser = driver.findElement(By.id("email"));
		type(txtUser, s);
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		type(txtPass, s2);
		
		
	}

	@Then("user should click logIn button")
	public void user_should_click_logIn_button() {
	    
	}
	
	


}
