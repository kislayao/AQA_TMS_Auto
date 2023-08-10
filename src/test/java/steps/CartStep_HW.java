package steps;

import baseEntities.BaseStep_HW;
import helper.DataHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.CartPage_HW;
import pages.CheckoutYourInformationPage_HW;
import pages.ProductsPage_HW;

public class CartStep_HW extends BaseStep_HW {

    static Logger logger = LogManager.getLogger(CartStep_HW.class);

    public CartStep_HW(WebDriver driver) {
        super(driver);
    }

    public CheckoutYourInformationPage_HW checkout_HW() {
        cartPage_HW.getCheckoutButton().click();

        logger.info("Checkout Page is opened");
        return checkoutYourInformationPage_HW;
    }

    public boolean checkProductIsInTheCart(){
        productsPage_HW.getItemTitle().isDisplayed();
        logger.info("Added to cart product is displayed in the cart");
        return true;
    }

}
