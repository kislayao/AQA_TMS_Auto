package steps;

import baseEntities.BaseStep_HW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutCompletePage_HW;
import pages.CheckoutOverviewPage_HW;

public class CheckoutOverviewStep_HW extends BaseStep_HW {

    public CheckoutOverviewStep_HW(WebDriver driver) {
        super(driver);
    }

    public CheckoutCompletePage_HW finishCheckout (){
        checkoutOverviewPage_HW.finishButton.click();
        return checkoutCompletePage_HW;
    }

    public boolean checkProductIsInTheOverview(){
        productsPage_HW.itemTitle.isDisplayed();
        return true;
    }

}
