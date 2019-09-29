package automation.truyenqc.cucumber.scenario;

import automation.truyenqc.cucumber.steps.HomeSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginScenario{
    @Steps
    HomeSteps homeStep;

    @Given("^I open the Home page$")
    public void i_open_the_Home_page() {
       homeStep.open_home_page();
      }

    @When("^I open the login screen$")
    public void i_open_the_login_screen() {
        homeStep.open_login_option_popup();
        homeStep.select_login_option();
    }

    @When("^I input the email is \"([^\"]*)\", password is \"([^\"]*)\" and click login button$")
    public void i_input_the_email_is_password_is_and_click_login_button(String arg1, String arg2) {

    }

    @Then("^I see \"([^\"]*)\" on the Home screen$")
    public void i_see_on_the_Home_screen(String arg1) {

    }

}
