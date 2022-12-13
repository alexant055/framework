package com.web.framework.cucumber;

import org.openqa.selenium.WebDriver;

import com.web.framework.managers.FileReaderManager;
import com.web.framework.providers.Context;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	Context context;

	public Hooks(Context context) {
		this.context = context;
	}

	@Before
	public void BeforeSteps() {
		WebDriver driver = context.getWebDriverManager().getDriver();
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	@After
	public void AfterSteps() {
		context.getWebDriverManager().closeDriver();
	}
}
