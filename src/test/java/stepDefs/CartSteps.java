package stepDefs;

import baseEntities.BaseTest_HW;
import io.cucumber.java.en.When;
import pages.CartPage_HW;
import pages.CheckoutYourInformationPage_HW;
import pages.ProductsPage_HW;

public class CartSteps extends BaseTest_HW {

    private BaseTest_HW baseTest;
    private CartPage_HW cartPage_hw;
//    private ProductsPage_HW productsPage_hw;

    public CartSteps(BaseTest_HW baseTest) {
        this.baseTest = baseTest;
        cartPage_hw = new CartPage_HW(driver);

    }


    @When("user clicks checkout")
    public void checkout_HW() {
        cartPage_hw.getCheckoutButton().click();
    }
}
