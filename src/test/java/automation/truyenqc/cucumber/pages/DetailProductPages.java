package automation.truyenqc.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class DetailProductPages extends PageObject {

    @FindBy (xpath="//*[@id='product-name']/span[3]")
    private WebElementFacade productName;

    @FindBy (xpath="//button[@class='add-to-cart  js-add-to-cart is-css']")
    private WebElementFacade addCardBtn;

    @FindBy (id="header-cart")
    private WebElementFacade checkCardBtn;

    public String get_product_title() {
        return productName.waitUntilPresent().getText();
    }

    public void click_add_to_card() {
        addCardBtn.waitUntilPresent().click();
    }

    public void check_out() {
        checkCardBtn.waitUntilPresent().click();
    }
}
