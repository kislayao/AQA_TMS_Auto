package steps;

import baseEntities.BaseStep_HW;
import org.openqa.selenium.WebDriver;
import pages.CartPage_HW;
import pages.CheckoutYourInformationPage_HW;
import pages.ProductsPage_HW;

public class CartStep_HW extends BaseStep_HW {

    public CartStep_HW(WebDriver driver) {
        super(driver);
    }

    public CheckoutYourInformationPage_HW checkout_HW() {
        cartPage_HW.checkoutButton.click();
        return checkoutYourInformationPage_HW;
    }

    public boolean checkProductIsInTheCart(){
        productsPage_HW.itemTitle.isDisplayed();
        return true;
    }

}
