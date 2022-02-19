package com.answer.step_definitions;

import com.answer.pages.FormAutPage;
import com.answer.utilities.BrowserUtils;
import com.answer.utilities.ConfigurationReader;
import com.answer.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FormAuthenStepDefs {
    FormAutPage formAutPage = new FormAutPage();

    @Given("the user is on the Menu page")
    public void the_user_is_on_the_Menu_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }
    @Given("the user clicks on {string} link")
    public void the_user_clicks_on_link(String FormAut) {
       // formAutPage.formAuthentLink.click();
        formAutPage.navigate(FormAut);

    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        formAutPage.login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
        String actualText = formAutPage.getLogInMessage.getText().trim();
        System.out.println(actualText);
        Assert.assertTrue(actualText.contains("You logged into a secure area!")); //OLMUYOR???????*********
    }

    @When("the user logs out")
    public void the_user_logs_out() {
        formAutPage.logOut.click();
    }
    @Then("the user should be able to see Login Page")
    public void the_user_should_be_able_to_see_Login_Page() {
      Assert.assertTrue(formAutPage.loginPageElement.isDisplayed());

    }
    @When("user enters invalid {string} and valid {string}")
     public void user_enters_invalid_and_valid(String username, String password) {
       formAutPage.userNameBox.sendKeys(username);
       formAutPage.passwordBox.sendKeys(password);
       formAutPage.login.click();
    }

    @Then("user should see error {string} message")
    public void user_should_see_error_message(String expectedMessage) {
       //String actualErrorMessage = formAutPage.getErrorMessage.getText().trim();
        //Assert.assertEquals(expectedMessage,new FormAutPage().getErrorMessage.getText().trim());
/////////?????????????????????????????????????
    }

    @When("user enters valid {string} and invalid {string}")
    public void user_enters_valid_and_invalid(String username, String password) {
        formAutPage.userNameBox.sendKeys(username);
        formAutPage.passwordBox.sendKeys(password);
        formAutPage.login.click();

   }

}
