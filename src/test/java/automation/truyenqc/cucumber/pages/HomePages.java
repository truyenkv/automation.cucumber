package automation.truyenqc.cucumber.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://tiki.vn/")
public class HomePages extends PageObject {


    @FindBy (xpath="//*[@class='tikicon icon-user']")
    WebElementFacade iconUser;

    @FindBy (xpath="//*[@id='login_link']")
    WebElementFacade loginOption;

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
}
