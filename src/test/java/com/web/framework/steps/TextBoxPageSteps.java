package com.web.framework.steps;

import static org.junit.Assert.assertEquals;

import com.web.framework.pages.TextBoxPage;
import com.web.framework.providers.Context;

import io.cucumber.java.en.Then;

public class TextBoxPageSteps {
	Context context;
	TextBoxPage textBoxPage;

	public TextBoxPageSteps(Context context) {
		this.context = context;
		textBoxPage = this.context.getPageObjectManager().getTextBoxPage();
	}

	@Then("fill text box form")
	public void fill_text_box_form() {
		assertEquals("Text Box", textBoxPage.getHeader());
	}
}
