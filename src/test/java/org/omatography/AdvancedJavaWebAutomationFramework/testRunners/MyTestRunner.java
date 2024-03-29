package org.omatography.AdvancedJavaWebAutomationFramework.testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources\\appFeatures\\login.feature"},
        glue = {"org.omatography.AdvancedJavaWebAutomationFramework.stepDefinitions",
                "org.omatography.AdvancedJavaWebAutomationFramework.appHooks"},
        plugin = {"pretty"}
)
public class MyTestRunner {
}