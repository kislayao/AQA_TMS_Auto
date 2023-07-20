package pages;

import baseEntities.BasePage_HW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage_HW extends BasePage_HW {

    // Блок описания локаторов для элементов
    @FindBy (xpath = "//span[contains(@class, 'title') and contains(text(), 'Products')]" )
    public WebElement headerTitle_ProductsPage_HW;

    public CartPage_HW cartPage_HW;

    @FindBy (id = "add-to-cart-sauce-labs-bike-light")
    public WebElement addToCartButton;

    @FindBy (id = "remove-sauce-labs-bike-light")
    public WebElement removeFromCartButton;

    @FindBy (id = "shopping_cart_container")
    public WebElement openCartButton;

    @FindBy (id = "shopping_cart_container")
    public WebElement itemTitle;

    // Блок инициализации
    public ProductsPage_HW(WebDriver driver) {
        super(driver);

        cartPage_HW = new CartPage_HW(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.xpath("//span[contains(@class, 'title') and contains(text(), 'Products')]");
    }

    // Блок атомарных методов
}
