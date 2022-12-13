package com.web.framework.providers;

import com.web.framework.managers.WebDriverMgr;
import com.web.framework.pages.PageObjectManager;

public class Context {
	private WebDriverMgr webDriverManager;
	private PageObjectManager pageManager;

	public Context() {
		webDriverManager = new WebDriverMgr();
		pageManager = new PageObjectManager(webDriverManager.createDriver());
	}

	public WebDriverMgr getWebDriverManager() {
		return webDriverManager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageManager;
	}
}
