package org.omatography.AdvancedJavaWebAutomationFramework.pages;

import org.omatography.AdvancedJavaWebAutomationFramework.factory.DriverFactory;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    public LoginPage() {
        driver = DriverFactory.getDriver();
    }

    public void loadPage(String url){
        driver.get(url);
    }
}
