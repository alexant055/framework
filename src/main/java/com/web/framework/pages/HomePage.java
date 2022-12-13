package com.web.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'Elements')]//ancestor::div[contains(@class, 'card mt-4 top-card')]")
	WebElement elementsCard;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void clickElementsCard() {
		elementsCard.click();
	}
}
