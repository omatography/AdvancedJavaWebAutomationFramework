package org.omatography.AdvancedJavaWebAutomationFramework.pages;

import org.omatography.AdvancedJavaWebAutomationFramework.constants.LocatorConstants;
import org.omatography.AdvancedJavaWebAutomationFramework.factory.DriverFactory;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.ElementUtils;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.ExtentTestManager;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.ProjectGeneric;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.PropertiesReader;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginPage {

    WebDriver driver;
    ElementUtils elementUtils;
    ProjectGeneric projectGeneric;
    public LoginPage(ElementUtils elementUtils, ProjectGeneric projectGeneric) {
        driver = DriverFactory.getDriver();
        this.elementUtils = elementUtils;
        this.projectGeneric = projectGeneric;
    }



    public void loadPage(String urlName) throws IOException {
        String url ;
            url = PropertiesReader.returnProperties("urls.properties").getProperty(urlName);
            System.out.println("Logging in: "+url);


        elementUtils.loadUrl(url);
        elementUtils.click(LocatorConstants.AmazonHomePage.cart.toString());

    }
}
