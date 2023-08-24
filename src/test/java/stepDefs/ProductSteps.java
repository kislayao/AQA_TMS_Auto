package stepDefs;

import baseEntities.BaseTest_HW;
import io.cucumber.java.en.When;
import pages.CartPage_HW;
import pages.ProductsPage_HW;

public class ProductSteps extends BaseTest_HW {

    private BaseTest_HW baseTest;
    private ProductsPage_HW productsPage_hw;

    public ProductSteps (BaseTest_HW baseTest) {
        this.baseTest = baseTest;
        productsPage_hw = new ProductsPage_HW(driver);
    }

    @When("user added item to the cart")
    public void addToCart_HW() {
        productsPage_hw.getAddToCartButton().click();
    }

    @When("user opens the cart")
    public void openCart_HW() {
        productsPage_hw.getOpenCartButton().click();
    }


    @When("user see added product on the opened page")
    public void checkProductIsInTheCart() {
        productsPage_hw.getItemTitle().isDisplayed();
    }


}
