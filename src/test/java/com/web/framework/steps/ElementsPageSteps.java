package com.web.framework.steps;

import static org.junit.Assert.assertEquals;

import com.web.framework.pages.ElementsPage;
import com.web.framework.providers.Context;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ElementsPageSteps {
	Context context;
	ElementsPage elementsPage;

	public ElementsPageSteps(Context context) {
		this.context = context;
		elementsPage = this.context.getPageObjectManager().getElementsPage();
	}

	@When("elements page visible")
	public void elements_page_visible() {
		assertEquals("Elements", elementsPage.getHeader());
	}

	@Then("click text box")
	public void click_text_box() {
		elementsPage.clickElement("Text Box");
	}
}
