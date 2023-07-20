package pages;

import baseEntities.BasePage_HW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage_HW extends BasePage_HW {

    // Блок описания локаторов для элементов

    private final By headerTitleLocator_CartPage_HW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Your Cart')]");

    private final By checkoutButtonLocator = By.id("checkout");

    // Блок инициализации

    public CartPage_HW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocator_CartPage_HW;
    }

    // Блок атомарных методов

    public WebElement getCheckoutButton() {
        return driver.findElement(checkoutButtonLocator);
    }

    // Complex methods

    public CheckoutYourInformationPage_HW checkout_HW() {
        getCheckoutButton().click();
        return new CheckoutYourInformationPage_HW(driver);
    }

//    public void checkProductIsInTheCart(){
//        new ProductsPage_HW(driver)
//        productsPage_HW.getItemTitle().isDisplayed();
//        return new CartPage_HW(driver);
//    }

}
