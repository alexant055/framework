package com.web.framework.pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	private WebDriver driver;
	private HomePage homePage;
	private TextBoxPage textBoxPage;
	private ElementsPage elementsPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}

	public TextBoxPage getTextBoxPage() {
		return (textBoxPage == null) ? textBoxPage = new TextBoxPage(driver) : textBoxPage;
	}

	public ElementsPage getElementsPage() {
		return (elementsPage == null) ? elementsPage = new ElementsPage(driver) : elementsPage;
	}
}
