package automation.truyenqc.cucumber.steps;

import automation.truyenqc.cucumber.pages.HomePages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class HomeSteps extends ScenarioSteps {

    HomePages homePage;

    @Step
    public void open_home_page() {
        homePage.open();
    }

    @Step
    public void open_login_option_popup() {
        homePage.open_login_option();
    }

    @Step
    public void select_login_option() {
        homePage.select_login();
    }

    @Step
    public String get_hello_user_string() {
        return homePage.get_hello_string();
    }

    @Step
    public void input_keyword_in_the_searchField(String keyword) {
        homePage.input_text_search(keyword);
    }

    @Step
    public void click_search_button() {
        homePage.click_search();
    }

    public String get_first_product_name() {
        return homePage.get_first_product_name();
    }

    public void click_on_product() {
        homePage.click_on_first_product();
    }
}
