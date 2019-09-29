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
}
