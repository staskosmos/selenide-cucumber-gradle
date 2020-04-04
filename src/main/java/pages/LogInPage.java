package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LogInPage {

    private SelenideElement emailInput = $(By.cssSelector("#email"));
    private SelenideElement passwordInput = $(By.cssSelector("#password"));
    private SelenideElement firstNameInput = $(By.cssSelector("#firstName"));
    private SelenideElement lastNameInput = $(By.cssSelector("#lastName"));
    private SelenideElement firstNameGet = $(By.cssSelector("#form_firstName"));
    private SelenideElement lastNameGet = $(By.cssSelector("#form_lastName"));

    public void inputEmail(String text){
        this.emailInput.val(text);
    }

    public void inputPassword(String text){
        this.passwordInput.val(text);
    }

    public void inputFirstName(String text){
        firstNameInput.val(text);
    }

    public void inputLastName(String text){
        lastNameInput.val(text);
    }

    public String getFirstName(){
        return firstNameGet.getValue();
    }

    public String getLastName(){
        return lastNameGet.getValue();
    }
}
