package pages;

import baseEntities.BasePage_HW;
import com.codeborne.selenide.SelenideElement;
import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginPage_HW extends BasePage_HW {

    // Блок описания локаторов для элементов
    private final By userNameInputLocator = By.id("user-name");
    private final By pswInputLocator = By.id("password");
    private final By loginButtonLocator = By.id("login-button");

    // Блок инициализации
    public LoginPage_HW() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return loginButtonLocator;
    }

    // Блок атомарных методов

    public SelenideElement getUserNameInput() {
        return $(userNameInputLocator);
    }

    public SelenideElement getPswInput() {
        return $(pswInputLocator);
    }

    public SelenideElement getLoginButton() {
        return $(loginButtonLocator);
    }

    // Блок комплексных методов

    public void login_HW(User user) {
        getUserNameInput().sendKeys(user.getUserName());
        getPswInput().sendKeys(user.getPassword());
        getLoginButton().click();
    }

}
