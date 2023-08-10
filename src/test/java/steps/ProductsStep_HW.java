package steps;

import baseEntities.BaseStep_HW;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.CartPage_HW;
import pages.ProductsPage_HW;

import java.util.NoSuchElementException;

public class ProductsStep_HW extends BaseStep_HW {

    static Logger logger = LogManager.getLogger(ProductsStep_HW.class);

    public ProductsStep_HW(WebDriver driver) {
        super(driver);
    }

    public ProductsPage_HW addToCart_HW() {
        productsPage_HW.getAddToCartButton().click();

        logger.info("Selected item is added to cart");
        return productsPage_HW;
    }

    public ProductsPage_HW removeButtonIsDisplayed() {
        productsPage_HW.getRemoveFromCartButton().isDisplayed();

        logger.info("'Add to cart' button is changed to 'Remove' button");
        return productsPage_HW;
    }

    public CartPage_HW openCart_HW() {
        productsPage_HW.getOpenCartButton().click();

        logger.info("Cart is opened");
        return cartPage_HW;
    }

}
