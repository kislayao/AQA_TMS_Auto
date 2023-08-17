package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStep_HW {
    protected LoginPage_HW loginPage_HW;
    protected ProductsPage_HW productsPage_HW;
    protected CartPage_HW cartPage_HW;
    protected CheckoutYourInformationPage_HW checkoutYourInformationPage_HW;
    protected CheckoutOverviewPage_HW checkoutOverviewPage_HW;
    protected CheckoutCompletePage_HW checkoutCompletePage_HW;


    public BaseStep_HW() {

        loginPage_HW = new LoginPage_HW();
        productsPage_HW = new ProductsPage_HW();
        cartPage_HW = new CartPage_HW();
        checkoutYourInformationPage_HW = new CheckoutYourInformationPage_HW();
        checkoutOverviewPage_HW = new CheckoutOverviewPage_HW();
        checkoutCompletePage_HW = new CheckoutCompletePage_HW();
    }
}
