package com.base;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LibGlobal {
	public WebDriver driver;
	public static final String USERNAME = "faizurrahman1";
	public static final String AUTOMATE_KEY = "k8ezQGkksbp2S7kuzoKp";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public WebDriver getDriverCloud() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "80.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "8.1");
	    caps.setCapability("resolution", "1024x768");
	    caps.setCapability("name", "Bstack-[Java] Sample Test");

	    return driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		
	}
	
	
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\faizur\\eclipse-cucumberr\\CucumTestNG\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void loadUrl(String s) {
		driver.get(s);
	}

	public void type(WebElement ele, String s) {
		ele.sendKeys(s);

	}
}
