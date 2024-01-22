package org.omatography.AdvancedJavaWebAutomationFramework.pages;

import org.omatography.AdvancedJavaWebAutomationFramework.constants.GlobalConstants;
import org.omatography.AdvancedJavaWebAutomationFramework.factory.DriverFactory;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.ElementUtils;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.PropertiesReader;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginPage {

    WebDriver driver;
    ElementUtils elementUtils;
    public LoginPage(ElementUtils elementUtils) {
        driver = DriverFactory.getDriver();
        this.elementUtils = elementUtils;
    }



    public void loadPage(String urlName) throws IOException {
        String url ;
            url = PropertiesReader.returnProperties(GlobalConstants.ProjectConstants.urlsProperties.toString()).getProperty(urlName);
            System.out.println("Logging in: "+url);


        elementUtils.loadUrl(url);
        elementUtils.click(GlobalConstants.AmazonHomePage.cart.toString());

    }
}
