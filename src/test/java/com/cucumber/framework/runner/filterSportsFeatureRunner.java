package com.cucumber.framework.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "classpath:featurefile/filterSports.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition" })
public class filterSportsFeatureRunner extends AbstractTestNGCucumberTests {
}
