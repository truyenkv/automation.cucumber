package automation.truyenqc.cucumber.steps;

import automation.truyenqc.cucumber.pages.LoginPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

    LoginPages loginPage;


    @Step
    public String get_error_message() {
        return loginPage.get_error();
    }

    @Step
    public void excute_login(String email, String password) {
        loginPage.input_login_form(email, password);
    }
}
