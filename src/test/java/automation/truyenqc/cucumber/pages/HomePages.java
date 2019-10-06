package automation.truyenqc.cucumber.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;



@DefaultUrl("https://tiki.vn/")
public class HomePages extends PageObject {


    @FindBy (xpath="//*[@class='tikicon icon-user']")
    private WebElementFacade iconUser;

    @FindBy (xpath="//button[1][contains(text(),'Đăng nhập')]")
    private WebElementFacade loginOption;

    @FindBy (xpath="//span[@class='Userstyle__NoWrap-xrezqc-11 cotJxS']")
    private WebElementFacade helloUser;

    @FindBy (xpath="//input[@type='text']")
    private WebElementFacade searchField;

    @FindBy (xpath="//button[@class='FormSearch__Button-hwmlek-3 dVzStw']")
    private WebElementFacade searchBtn;

    @FindBy (xpath = "//*[@data-title='Máy Quay DJI OSMO Pocket - Hàng Chính hãng']")
    private WebElementFacade firstProductName;

    @WhenPageOpens
    public void maximiseScreen() {
        getDriver().manage().window().maximize();
    }

    public void open_login_option() {
        iconUser.waitUntilPresent().click();
    }

    public void select_login() {
        loginOption.waitUntilPresent().click();
    }

    public String get_hello_string() {
        waitABit(2000);
        return helloUser.waitUntilPresent().getText();
    }

    public void input_text_search(String keyword) {
        searchField.waitUntilClickable();
        typeInto(searchField, keyword);
    }

    public void click_search() {
        searchBtn.waitUntilPresent().click();
    }

    public String get_first_product_name() {
        return firstProductName.waitUntilPresent().getText();
    }

    public void click_on_first_product() {
        firstProductName.waitUntilClickable().click();
    }
}
