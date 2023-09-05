package pages;

import baseEntities.BasePage_HW;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductsPage_HW extends BasePage_HW {

    // Блок описания локаторов для элементов
    private final By headerTitleLocator_ProductsPage_HW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Products')]");

    public CartPage_HW cartPage_HW;

    private final By addToCartButtonLocator = By.id("add-to-cart-sauce-labs-bike-light");
    private final By removeFromCartButtonLocator = By.id("remove-sauce-labs-bike-light");
    private final By openCartButtonLocator = By.id("shopping_cart_container");
    private final By itemTitleLocator = By.id("shopping_cart_container");

    // Блок инициализации
    public ProductsPage_HW() {
        super();

        cartPage_HW = new CartPage_HW();
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocator_ProductsPage_HW;
    }

    // Блок атомарных методов

    public SelenideElement getAddToCartButton() {
        return $(addToCartButtonLocator);
    }

    public SelenideElement getRemoveFromCartButton() {
        return $(removeFromCartButtonLocator);
    }

    public SelenideElement getOpenCartButton() {
        return $(openCartButtonLocator);
    }

    public SelenideElement getItemTitle() {
        return $(itemTitleLocator);
    }

}
