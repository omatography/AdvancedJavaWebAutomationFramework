package org.omatography.AdvancedJavaWebAutomationFramework.testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources\\appFeatures\\login.feature"},
        glue = {"org.omatography.AdvancedJavaWebAutomationFramework.stepDefinitions",
                "org.omatography.AdvancedJavaWebAutomationFramework.appHooks"},
        plugin = {"pretty"}
)
public class MyTestRunnerTestNG extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider
    public Object [][] scenarios(){
        return super.scenarios();
    }
}