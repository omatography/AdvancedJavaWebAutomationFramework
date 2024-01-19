package org.omatography.AdvancedJavaWebAutomationFramework.pages;

import org.omatography.AdvancedJavaWebAutomationFramework.factory.DriverFactory;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.ExtentTestManager;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.PropertiesReader;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginPage {

    WebDriver driver;
    public LoginPage() {
        driver = DriverFactory.getDriver();
    }

    public void loadPage(String urlName)  {
        String url ;
        try {
            url = PropertiesReader.returnProperties("urls.properties").getProperty(urlName);
            System.out.println("Logging in: "+url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        driver.get(url);
    }
}
