package org.omatography.AdvancedJavaWebAutomationFramework.stepDefinitions;

import com.aventstack.extentreports.App;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.omatography.AdvancedJavaWebAutomationFramework.appHooks.AppHooks;
import org.omatography.AdvancedJavaWebAutomationFramework.constants.GlobalConstants;
import org.omatography.AdvancedJavaWebAutomationFramework.pages.LoginPage;

import java.io.IOException;

public class LoginSteps extends StepDefinitionsBaseClass {

//    LoginPage loginPage = new LoginPage();
    @Given("I am at amazon login page")
    public void i_Am_At_Amazon_Login_Page() throws IOException {
        loginPage.loadPage(GlobalConstants.AmazonUrls.homePageUrl.toString());
    }
    @Given("I have a search field in amazon")
    public void i_have_a_search_field_in_amazon() {
        System.out.println("I have a search field in amazon");
    }
    @When("I search {string} in search")
    public void i_search_in_search(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I have a search field in amazon");
    }
    @Then("Product named {string} with price {int} will appear")
    public void product_named_with_price_will_appear(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I have a search field in amazon");
    }


}
