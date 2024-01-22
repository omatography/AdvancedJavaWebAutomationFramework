package org.omatography.AdvancedJavaWebAutomationFramework.appHooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.omatography.AdvancedJavaWebAutomationFramework.constants.GlobalConstants;
import org.omatography.AdvancedJavaWebAutomationFramework.factory.DriverFactory;
import org.omatography.AdvancedJavaWebAutomationFramework.pages.LoginPage;
import org.omatography.AdvancedJavaWebAutomationFramework.stepDefinitions.StepDefinitionsBaseClass;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.ElementUtils;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.PropertiesReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

public class AppHooks {
    //Class to define hooks @Before @After before running feature.
    private final DriverFactory driverFactory = new DriverFactory();

    @Before(order = 0)
    public void setupBrowser() throws IOException {
        System.out.println("setup browser");
        driverFactory.initDriver();
    }
    @Before(order = 1)
    public void initializeClasses() throws IOException, SQLException {
        System.out.println("Initialize");
        //utilities init here
        StepDefinitionsBaseClass.initClasses();
    }

    @After(order = 0)
    public void quitBrowser(){
        driverFactory.quitDriver();
    }

}
