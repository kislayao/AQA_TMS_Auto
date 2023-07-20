package pages;

import baseEntities.BasePage_HW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage_HW extends BasePage_HW {

    // Блок описания локаторов для элементов

    @FindBy (xpath = "//span[contains(@class, 'title') and contains(text(), 'Checkout: Complete!')]")
    public WebElement headerTitle_CheckoutCompletePage_HW;

    // Блок инициализации

    public CheckoutCompletePage_HW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.xpath("//span[contains(@class, 'title') and contains(text(), 'Checkout: Complete!')]");
    }

}
