package steps;

import baseEntities.BaseStep_HW;
import org.openqa.selenium.WebDriver;
import pages.CartPage_HW;
import pages.ProductsPage_HW;

import java.util.NoSuchElementException;

public class ProductsStep_HW extends BaseStep_HW {

    public ProductsStep_HW(WebDriver driver) {
        super(driver);
    }

    public ProductsPage_HW addToCart_HW() {
        productsPage_HW.addToCartButton.click();
        return productsPage_HW;
    }

    public ProductsPage_HW removeButtonIsDisplayed() {
        productsPage_HW.removeFromCartButton.isDisplayed();
        return productsPage_HW;
    }

    public CartPage_HW openCart_HW() {
        productsPage_HW.openCartButton.click();
        return cartPage_HW;
    }

}
