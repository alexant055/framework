package com.web.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {

	WebDriver driver;

	@FindBy(how = How.CSS, using = "div.main-header")
	WebElement header;

	public TextBoxPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getHeader() {
		return header.getText();
	}

}
