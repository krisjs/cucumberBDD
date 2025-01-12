package com.learning.cucumberBDD.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/com/learning/cucumberBDD/features",
    glue = "com/learning/cucumberBDD/stepdefinitions",
    plugin = ("pretty , html:target/cucumber-reports")
)
public class TestRunner {
	

}
