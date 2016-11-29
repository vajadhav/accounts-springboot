package com.account.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber"},
        glue = "com.account.bdd.steps",
        features = "classpath:cucumber/account.feature"
)
public class RunAccountTest {
}
