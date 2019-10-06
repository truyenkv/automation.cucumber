package automation.truyenqc.cucumber.steps;

import automation.truyenqc.cucumber.pages.DetailProductPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DetailProductSteps extends ScenarioSteps {
    DetailProductPages detailProductPage;

    @Step
    public String get_product_name() {
        return detailProductPage.get_product_title();
    }

    @Step
    public void add_product_to_card() {
        detailProductPage.click_add_to_card();
    }

    @Step
    public void checkout_the_card() {
        detailProductPage.check_out();
    }
}
