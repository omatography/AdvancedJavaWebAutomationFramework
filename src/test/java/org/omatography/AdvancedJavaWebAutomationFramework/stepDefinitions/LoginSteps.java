package org.omatography.AdvancedJavaWebAutomationFramework.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.omatography.AdvancedJavaWebAutomationFramework.pages.LoginPage;

import java.io.IOException;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    @Given("I am at amazon login page")
    public void i_Am_At_Amazon_Login_Page() {
        loginPage.loadPage("homePageUrl");
    }
    @Given("I have a search field in amazon")
    public void i_have_a_search_field_in_amazon() {

    }
    @When("I search {string} in search")
    public void i_search_in_search(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Product named {string} with price {int} will appear")
    public void product_named_with_price_will_appear(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
