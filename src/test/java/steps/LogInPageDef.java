package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import pages.LogInPage;

import static app_context.RunContext.get;
import static app_context.RunContext.put;

public class LogInPageDef {
    LogInPage logInPage = new LogInPage();

    @Then("Input email")
    public  void inputEmail() {
        String email = "Auto_"+ RandomStringUtils.randomAlphabetic(5)+"@mail.com";
        logInPage.inputEmail(email);
        put("email", email);

    }

    @Then("Input password")
    public void inputPassword() {
        logInPage.inputPassword(UserConfig.USER_PASSWORD);
    }

    @Then("Input First Name")
    public void inputFirstName(){
        String firstName = UserConfig.USER_FIRST_NAME;
        logInPage.inputFirstName(firstName);
        put("firstName",firstName);
    }

    @Then("Input Last Name")
    public void inputLastName(){
        String lastName = UserConfig.USER_LAST_NAME;
        logInPage.inputLastName(lastName);
        put("lastName",lastName);
    }

    @Then("Check First Name")
    public void checkFirstName(){
        String expectFirstName = get("firstName",String.class);
        String actualFirstName = logInPage.getFirstName();
        Assert.assertEquals(expectFirstName,actualFirstName);
    }

    @Then("Check Last Name")
    public void checkLastName(){
        String expectLastName = get("lastName",String.class);
        String actualLastName = logInPage.getLastName();
        Assert.assertEquals(expectLastName,actualLastName);
    }
}
