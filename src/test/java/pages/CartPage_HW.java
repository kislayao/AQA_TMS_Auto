package pages;

import baseEntities.BasePage_HW;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage_HW extends BasePage_HW {

    // Блок описания локаторов для элементов

    private final By headerTitleLocator_CartPage_HW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Your Cart')]");

    private final By checkoutButtonLocator = By.id("checkout");

    // Блок инициализации

    public CartPage_HW() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocator_CartPage_HW;
    }

    // Блок атомарных методов

    public SelenideElement getCheckoutButton() {
        return $(checkoutButtonLocator);
    }

}
