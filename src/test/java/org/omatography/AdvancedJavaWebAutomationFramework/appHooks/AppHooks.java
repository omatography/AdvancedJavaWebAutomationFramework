package org.omatography.AdvancedJavaWebAutomationFramework.appHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.omatography.AdvancedJavaWebAutomationFramework.factory.DriverFactory;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.PropertiesReader;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

public class AppHooks {

    private final DriverFactory driverFactory = new DriverFactory();
    private WebDriver driver;
    private Properties config;

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

    @After(order = 0)
    public void quitBrowser(){
        driver.quit();
    }

}
