package pages;

import baseEntities.BasePage_HW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutYourInformationPage_HW extends BasePage_HW {

    // Блок описания локаторов для элементов

    @FindBy (xpath = "//span[contains(@class, 'title') and contains(text(), 'Checkout: Your Information')]")
    public WebElement headerTitle_CheckoutYourInformationPage_HW;

    @FindBy(id = "first-name")
    public WebElement firstNameInput;

    @FindBy(id = "last-name")
    public WebElement lastNameInput;

    @FindBy(id = "postal-code")
    public WebElement postalCodeInput;

    @FindBy(id = "continue")
    public WebElement continueButton;

    // Блок инициализации

    public CheckoutYourInformationPage_HW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.xpath("//span[contains(@class, 'title') and contains(text(), 'Checkout: Your Information')]");
    }

    // Блок атомарных методов

    public void fillInYourInfoData() {
        firstNameInput.sendKeys("testFirstName");
        lastNameInput.sendKeys("testLastName");
        postalCodeInput.sendKeys("123");
    }

}
