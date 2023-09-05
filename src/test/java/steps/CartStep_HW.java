package steps;

import baseEntities.BaseStep_HW;
import org.openqa.selenium.WebDriver;
import pages.CartPage_HW;
import pages.CheckoutYourInformationPage_HW;
import pages.ProductsPage_HW;

import static com.codeborne.selenide.Condition.visible;

public class CartStep_HW extends BaseStep_HW {

    public CartStep_HW() {
        super();
    }

    public CheckoutYourInformationPage_HW checkout_HW() {
        cartPage_HW.getCheckoutButton().click();
        return checkoutYourInformationPage_HW;
    }

    public boolean checkProductIsInTheCart(){
        productsPage_HW.getItemTitle().shouldBe(visible);
        return true;
    }

}
