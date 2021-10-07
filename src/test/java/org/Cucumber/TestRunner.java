package org.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\lenovo\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Facebooklogin.feature", glue="org.Stepdef")
public class TestRunner {

}
