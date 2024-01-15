package org.omatography.AdvancedJavaWebAutomationFramework.testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        value = features: {},
        glue: {},
        plugin = {"pretty"

        }
)
public class MyTestRunner extends Abstract{
}
