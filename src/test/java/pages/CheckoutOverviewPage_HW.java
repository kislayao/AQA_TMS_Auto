package pages;

import baseEntities.BasePage_HW;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutOverviewPage_HW extends BasePage_HW {

    // Блок описания локаторов для элементов

    private final By headerTitleLocator_CheckoutOverviewPage_HW = By.xpath("//span[contains(@class, 'title') " +
            "and contains(text(), 'Checkout: Overview')]");

    private final By finishButtonLocator = By.id("finish");

    // Блок инициализации

    public CheckoutOverviewPage_HW() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLocator_CheckoutOverviewPage_HW;
    }

    // Блок атомарных методов

    public SelenideElement getFinishButton() {
        return $(finishButtonLocator);
    }

}
