package org.omatography.AdvancedJavaWebAutomationFramework.stepDefinitions;

import org.omatography.AdvancedJavaWebAutomationFramework.pages.LoginPage;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.Database;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.ElementUtils;

import java.io.IOException;
import java.sql.SQLException;

public class StepDefinitionsBaseClass {

    protected static LoginPage loginPage ;
    protected static ElementUtils  elementUtils ;
    public static Database mySql;



    public static void initClasses() throws IOException, SQLException {
        //utilities
        elementUtils  = new ElementUtils();
        //page objects
        loginPage = new LoginPage(elementUtils);
        mySql = new Database("jdbc:mysql://127.0.0.1:3306/oma","root","admin");
        mySql.connect();

    }
}
