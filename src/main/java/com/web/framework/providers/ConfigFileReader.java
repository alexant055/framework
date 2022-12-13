package com.web.framework.providers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.web.framework.enums.Browser;

public class ConfigFileReader {
	private Properties properties;

	public ConfigFileReader() {
		String filePath = "";
		String environment = System.getProperty("env");

		if (environment != null)
			filePath = System.getProperty("user.dir") + "/src/main/resources/config-" + environment + ".properties";
		else
			throw new RuntimeException("Environment is " + environment);

		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));

			properties = new Properties();
			properties.load(reader);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + filePath);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Properties input exception");
		}
	}

	public Browser getBrowser() {
		String browserName = System.getProperty("browser") != null ? System.getProperty("browser")
				: properties.getProperty("browser");

		return Browser.valueOf(browserName.toUpperCase());
	}

	public String getApplicationUrl() {
		return properties.getProperty("url");
	}
}
