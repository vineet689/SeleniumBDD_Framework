package com.softwaretestingboard;

//https://github.com/selenium-webdriver-software-testing/cucumber-bdd-webdriver-java-demo
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) 
@CucumberOptions(features = "src/test/resources/com/softwaretestingboard/checkout.feature",format = {"pretty", "html:target/cucumber","json:target/stock.json" })
public class RunCheckOutFeature  {
}
