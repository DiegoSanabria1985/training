package com.saucedemo.test.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Login.feature",
glue = "com.saucedemo.test.Stepdefinitions",
snippets = SnippetType.CAMELCASE,
tags = "@Login")
public class Runner_saucedemo {
}
