package com.web.framework.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.web.framework.enums.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMgr {
	private WebDriver driver;
	private static Browser driverType;

	public WebDriverMgr() {
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
	}

	public WebDriver createDriver() {
		switch (driverType) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			// TODO Firefox driver implementation
			break;
		case IE:
			// IE driver implementation
			break;
		case EDGE:
			// Microsoft Edge driver implementation
			break;
		default:
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		return driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void closeDriver() {
		driver.close();
		driver.quit();
	}
}
