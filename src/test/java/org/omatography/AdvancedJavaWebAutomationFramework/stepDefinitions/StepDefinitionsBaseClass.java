package org.omatography.AdvancedJavaWebAutomationFramework.stepDefinitions;

import io.cucumber.java.an.E;
import org.omatography.AdvancedJavaWebAutomationFramework.factory.DriverFactory;
import org.omatography.AdvancedJavaWebAutomationFramework.pages.LoginPage;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.ElementUtils;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.ProjectGeneric;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class StepDefinitionsBaseClass {

    protected static LoginPage loginPage ;
    protected static ElementUtils  elementUtils ;
    protected static ProjectGeneric projectGeneric;


    public static void initClasses() throws IOException {
        //utilities
        elementUtils  = new ElementUtils();
        projectGeneric = new ProjectGeneric();
        //page objects
        loginPage = new LoginPage(elementUtils,projectGeneric);
    }
}
