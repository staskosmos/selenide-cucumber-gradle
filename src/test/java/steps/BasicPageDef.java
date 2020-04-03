package steps;

import config.EnvConfig;
import io.cucumber.java.en.Then;
import pages.BasicPage;

import static com.codeborne.selenide.Selenide.open;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    @Then("Click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);
    }

    @Then("Click {string} button span")
    public void clickButtonSpan(String arg0) {
        basicPage.clickButtonSpan(arg0);
    }

    @Then("Content with {string} visible")
    public void contentWithVisible(String arg0) {
        basicPage.contentIsVisible(arg0);
    }

    @Then("Open {string} page")
    public void openPage(String arg0) {
        open(EnvConfig.URI_LOGIN+arg0);    }

    @Then("Click {string} button li")
    public void clickButtonLi(String arg0) {
        basicPage.clickButtonLi(arg0);
    }
}
