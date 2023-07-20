package pages;

import baseEntities.BasePage_HW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    public ProductsPage_HW(WebDriver driver) {
        super(driver);

        cartPage_HW = new CartPage_HW(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocator_ProductsPage_HW;
    }

    // Блок атомарных методов

    public WebElement getAddToCartButton() {
        return driver.findElement(addToCartButtonLocator);
    }

    public WebElement getRemoveFromCartButton() {
        return driver.findElement(removeFromCartButtonLocator);
    }

    public WebElement getOpenCartButton() {
        return driver.findElement(openCartButtonLocator);
    }

    public WebElement getItemTitle() {
        return driver.findElement(itemTitleLocator);
    }

}
