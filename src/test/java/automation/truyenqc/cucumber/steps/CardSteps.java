package automation.truyenqc.cucumber.steps;

import automation.truyenqc.cucumber.pages.CardPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CardSteps extends ScenarioSteps {

    CardPages cardPage;

    @Step
    public String get_product_name() {
        return cardPage.check_product_name_is();
    }

    @Step
    public boolean check_image_product() {
        waitABit(3000);
        return cardPage.check_image_item();
    }
}
