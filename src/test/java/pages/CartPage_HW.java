package pages;

import baseEntities.BasePage_HW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage_HW extends BasePage_HW {

    // Блок описания локаторов для элементов

    @FindBy (xpath = "//span[contains(@class, 'title') and contains(text(), 'Your Cart')]")
    public WebElement headerTitle_CartPage_HW;

    @FindBy (id = "checkout")
    public WebElement checkoutButton;

    // Блок инициализации

    public CartPage_HW(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.xpath("//span[contains(@class, 'title') and contains(text(), 'Your Cart')]");
    }

    // Блок атомарных методов


}
