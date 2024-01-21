package org.omatography.AdvancedJavaWebAutomationFramework.appHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.omatography.AdvancedJavaWebAutomationFramework.factory.DriverFactory;
import org.omatography.AdvancedJavaWebAutomationFramework.pages.LoginPage;
import org.omatography.AdvancedJavaWebAutomationFramework.stepDefinitions.LoginSteps;
import org.omatography.AdvancedJavaWebAutomationFramework.stepDefinitions.StepDefinitionsBaseClass;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.ElementUtils;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.ProjectGeneric;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.PropertiesReader;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

public class AppHooks {

    private final DriverFactory driverFactory = new DriverFactory();
    private WebDriver driver;
    private Properties config;

    protected ElementUtils elementUtils;
    protected ProjectGeneric projectGeneric;
    protected LoginPage loginPage;

    @Before(order = 0)
    public void setupConfig() throws IOException {
        System.out.println("setup config");
        config = PropertiesReader.returnProperties("config.properties");
    }

    @Before(order = 1)
    public void setupBrowser(){
        System.out.println("setup browser");
        driver = driverFactory.initDriver(config.getProperty("browser"));
    }

    @Before(order = 2)
    public void initializeClasses() throws IOException {
        System.out.println("Initialize");
        //utilities init here
        StepDefinitionsBaseClass.initClasses();
    }

    @After(order = 0)
    public void quitBrowser(){
        driver.quit();
    }

}
