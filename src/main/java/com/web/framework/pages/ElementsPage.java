package com.web.framework.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {
	WebDriver driver;

	@FindBy(how = How.CSS, using = "div.main-header")
	WebElement header;
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'element-list collapse show')]//ul//li")
	List<WebElement> elements;

	public ElementsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getHeader() {
		return header.getText();
	}

	public void clickElement(String elementName) {
		elements.stream().filter(element -> element.getText().equalsIgnoreCase(elementName)).findFirst().get().click();
	}
}
