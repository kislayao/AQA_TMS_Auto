package steps;

import baseEntities.BaseStep_HW;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebDriver;
import pages.CartPage_HW;
import pages.ProductsPage_HW;

import java.util.NoSuchElementException;

import static com.codeborne.selenide.Condition.visible;

public class ProductsStep_HW extends BaseStep_HW {

    public ProductsStep_HW() {
        super();
    }

    public ProductsPage_HW addToCart_HW() {
        productsPage_HW.getAddToCartButton().click();
        return productsPage_HW;
    }

    public ProductsPage_HW removeButtonIsDisplayed() {
        productsPage_HW.getRemoveFromCartButton().shouldBe(visible);
        return productsPage_HW;
    }

    public CartPage_HW openCart_HW() {
        productsPage_HW.getOpenCartButton().click();
        return cartPage_HW;
    }

}
