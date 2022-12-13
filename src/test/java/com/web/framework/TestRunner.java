package com.web.framework;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.web.framework.cucumber",
		"com.web.framework.steps" })
public class TestRunner {

}
