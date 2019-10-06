package automation.truyenqc.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LoginPages extends PageObject {

    @FindBy (id="email")
    private WebElementFacade email_field;

    @FindBy (id="password")
    private WebElementFacade pass_field;

    @FindBy (xpath="//button[@class='UserModalstyle__RightButton-uq4a18-8 jpHvvv']")
    private WebElementFacade dangnhap_btn;

    @FindBy (xpath = "//*[@class='InputError-xeouh7-0 jTQGhp']")
    private WebElementFacade error_mess;


    public String get_error() {
        return error_mess.waitUntilPresent().getText();
    }

    public void input_login_form(String email, String password) {
        email_field.waitUntilPresent();
        typeInto(email_field, email);
        typeInto(pass_field, password);
        dangnhap_btn.waitUntilPresent().click();
    }
}
