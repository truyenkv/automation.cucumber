package automation.truyenqc.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CardPages extends PageObject {

    @FindBy(xpath = "//p[@class='name']/a/span/text()")
    private WebElementFacade itemName;
    @FindBy(xpath = "//img[@class='img-responsive']")
    private WebElementFacade imageProduct;

    public String check_product_name_is() {
        waitABit(3000);
        return itemName.waitUntilPresent().getText();
    }


    public boolean check_image_item() {
        return imageProduct.isPresent();
    }
}
