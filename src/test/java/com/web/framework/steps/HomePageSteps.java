package com.web.framework.steps;

import static org.junit.Assert.assertEquals;

import com.web.framework.pages.HomePage;
import com.web.framework.providers.Context;

import io.cucumber.java.en.Given;

public class HomePageSteps {

	Context context;
	HomePage homePage;

	public HomePageSteps(Context context) {
		this.context = context;
		homePage = this.context.getPageObjectManager().getHomePage();
	}

	@Given("Application launcehed")
	public void application_launcehed() {
		assertEquals("ToolsQA", homePage.getTitle());
	}

	@Given("click elements card")
	public void click_elements_card() {
		homePage.clickElementsCard();
	}
}
