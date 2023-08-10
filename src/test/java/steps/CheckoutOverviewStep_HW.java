package steps;

import baseEntities.BaseStep_HW;
import helper.DataHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.CheckoutCompletePage_HW;
import pages.CheckoutOverviewPage_HW;

public class CheckoutOverviewStep_HW extends BaseStep_HW {

    static Logger logger = LogManager.getLogger(CheckoutOverviewStep_HW.class);

    public CheckoutOverviewStep_HW(WebDriver driver) {
        super(driver);
    }

    public CheckoutCompletePage_HW finishCheckout (){
        checkoutOverviewPage_HW.getFinishButton().click();

        logger.info("Checkout is finished");
        return checkoutCompletePage_HW;
    }

    public boolean checkProductIsInTheOverview(){
        productsPage_HW.getItemTitle().isDisplayed();

        logger.info("Added to cart product is displayed in overview");
        return true;
    }

}
