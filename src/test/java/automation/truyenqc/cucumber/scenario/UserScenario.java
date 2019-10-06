package automation.truyenqc.cucumber.scenario;

import automation.truyenqc.cucumber.steps.CardSteps;
import automation.truyenqc.cucumber.steps.DetailProductSteps;
import automation.truyenqc.cucumber.steps.HomeSteps;
import automation.truyenqc.cucumber.steps.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class UserScenario {
    @Steps
    HomeSteps homeStep;
    @Steps
    LoginSteps loginStep;
    @Steps
    DetailProductSteps detailProductStep;
    @Steps
    CardSteps cardStep;

    @Given("^I open the Home page$")
    public void i_open_the_Home_page() {
       homeStep.open_home_page();
      }

    @When("^I open the login screen$")
    public void i_open_the_login_screen() {
        homeStep.open_login_option_popup();
        homeStep.select_login_option();
    }

    @When("^I input the email is '(.*)', password is '(.*)' and click login button$")
    public void i_input_the_email_is_password_is_and_click_login_button(String email, String password) {
        loginStep.excute_login(email,password);
    }


    @Then("^I see '(.*)' on the Home screen$")
    public void i_see_on_the_Home_screen(String hellUser) {
        Assert.assertEquals(homeStep.get_hello_user_string(), hellUser);
        System.out.println(homeStep.get_hello_user_string());
    }

    @Then("^I see '(.*)' on the Login screen$")
    public void i_see_error_on_the_Login_screen(String error) {
        Assert.assertEquals(loginStep.get_error_message(), error);
    }

    @When("^I want to search the production is '(.*)' and click search button$")
    public void i_want_to_search_the_production_is_and_click_search_button(String keyword) {
        homeStep.input_keyword_in_the_searchField(keyword);
        homeStep.click_search_button();
    }

    @Then("^I should see the '(.*)' on screen$")
    public void i_should_see_the_product_on_screen(String produc_name) {
        System.out.println(detailProductStep.get_product_name());
        Assert.assertEquals(detailProductStep.get_product_name(), produc_name);
    }

    @When("^I click on the first product on screen$")
    public void i_click_on_the_first_product_on_screen() {
        homeStep.click_on_product();
    }

    @Then("^I add product to card$")
    public void i_add_product_to_card() {
        detailProductStep.add_product_to_card();
    }

    @Then("^I check out the card$")
    public void i_check_out_the_card() {
        detailProductStep.checkout_the_card();
    }

    @Then("^I should see the '(.*)' on the Card screen$")
    public void i_should_see_the_product_on_the_Card_screen(String nameProduct) {
        boolean image = true;
        Assert.assertEquals(cardStep.check_image_product(), image);
        Assert.assertEquals(cardStep.get_product_name(), nameProduct);
    }

}
