package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import runnerTest.webPages.LoginPage;
import utils.BasePage;

public class LoginParametersSD {

    private final LoginPage loginPage = new LoginPage();

    @Given("^I am on admin panel page$")
    public void iAmOnAdminLoginPage(){
        Assert.assertEquals(loginPage.getAdminHeader(), "Admin area demo");
    }

    @When("^I enter (.+) into (username|password) text fields on admin login page$")
    public void enterDataUserAndPAssField(String anyText, String textField){

        switch (textField){
            case "username":
                loginPage.enterEmail(anyText);
                break;
            case "password":
                loginPage.enterPassword(anyText);
                break;
        }
    }

    @And("^I click on (login button|create account) on admin login page$")
    public void clickOnButton(String button){

        switch (button){
            case "login button":
                loginPage.clickOnLogin();
                break;
            case "create account":
                //implement create account
                break;
        }
    }

    @Then("^I verify that I used invalid credentials$")
    public void verifyValidLogin(){
        Assert.assertEquals(true, loginPage.getErrorMessage().contains("Login was unsuccessful."));

    }
}
