package pages;

import baseEntities.BasePage_HW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_HW extends BasePage_HW {

    // Блок описания локаторов для элементов
    @FindBy (id = "user-name")
    public WebElement userNameInput;

    @FindBy (id = "password")
    public WebElement pswInput;

    @FindBy (id = "login-button")
    public WebElement loginButton;

    // Блок инициализации
    public LoginPage_HW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.id("login-button");
    }

    // Блок атомарных методов

    // Блок комплексных методов
    public void login_HW(String usernameHW, String pswHW) {
        userNameInput.sendKeys(usernameHW);
        pswInput.sendKeys(pswHW);
        loginButton.click();
    }

}
