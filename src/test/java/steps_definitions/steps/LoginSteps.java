package steps_definitions.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps_definitions.common_steps.CommonSteps;

public class LoginSteps extends CommonSteps {

    @Given("I landed on the login page.")
    public void i_landed_on_the_login_page() {
        this.landingPage = this.launchApplication();
    }
    @Given("logged in with incorrect username {string} and  password {string}")
    public void logged_in_with_incorrect_username_and_password(String username, String password) {
        this.landingPage.enterCredentials(username,password);
    }

    @When("clicked on login button.")
    public void clicked_on_login_button() {
        this.landingPage.validateCredentials();
    }
    @Then("I get the mesage {string} on display.")
    public void i_get_the_mesage_on_display(String message) {
        Assert.assertTrue(this.landingPage.getToastMessageContent().equalsIgnoreCase(message));
        this.quitTest();
    }

}
