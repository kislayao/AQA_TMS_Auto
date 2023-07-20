package pages;

import baseEntities.BasePage_HW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage_HW extends BasePage_HW {

    // Блок описания локаторов для элементов

    private final By headerTitleLocator_CheckoutCompletePage_HW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Checkout: Complete!')]");

    // Блок инициализации

    public CheckoutCompletePage_HW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocator_CheckoutCompletePage_HW;
    }

}
