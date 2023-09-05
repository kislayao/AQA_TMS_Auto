package pages;

import baseEntities.BasePage_HW;
import com.codeborne.selenide.SelenideElement;
import models.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutYourInformationPage_HW extends BasePage_HW {

    // Блок описания локаторов для элементов

    private final By headerTitleLocator_CheckoutYourInformationPage_HW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Checkout: Your Information')]");

    //public BurgerMenuPage_HW burgerMenuPage_HW;

    private final By firstNameInputLocator = By.id("first-name");
    private final By lastNameInputLocator = By.id("last-name");
    private final By postalCodeInputLocator = By.id("postal-code");
    private final By continueButtonLocator = By.id("continue");

    // Блок инициализации

    public CheckoutYourInformationPage_HW() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocator_CheckoutYourInformationPage_HW;
    }

    // Блок атомарных методов

    public SelenideElement getFirstNameInput() {
        return $(firstNameInputLocator);
    }

    public SelenideElement getLastNameInput() {
        return $(lastNameInputLocator);
    }

    public SelenideElement getPostalCodeInput() {
        return $(postalCodeInputLocator);
    }

    public SelenideElement getContinueButton() {
        return $(continueButtonLocator);
    }

    public void setFirstName(String value) {
        getFirstNameInput().sendKeys(value);
    }

    public void setLastName(String value) {
        getLastNameInput().sendKeys(value);
    }

    public void setPostalCode(int value) {
        getPostalCodeInput().sendKeys(String.valueOf(value));
    }

    public void fillInYourInfoData (UserData userData) {
        setFirstName(userData.getFirstName());
        setLastName(userData.getLastName());
        setPostalCode(userData.getPostalCode());
    }

}
