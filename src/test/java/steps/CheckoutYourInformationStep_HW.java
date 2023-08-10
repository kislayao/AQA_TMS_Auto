package steps;

import baseEntities.BaseStep_HW;
import models.UserData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.CheckoutOverviewPage_HW;
import pages.CheckoutYourInformationPage_HW;

public class CheckoutYourInformationStep_HW extends BaseStep_HW {

    static Logger logger = LogManager.getLogger(CheckoutYourInformationStep_HW.class);

    public CheckoutYourInformationStep_HW(WebDriver driver) {
        super(driver);
    }

    public CheckoutYourInformationPage_HW fillingInWithValidData_HW(UserData userData) {
        checkoutYourInformationPage_HW.fillInYourInfoData(userData);

        logger.info("User information form is filled with data");
        return checkoutYourInformationPage_HW;
    }

    public CheckoutOverviewPage_HW continueCheckout(){
        checkoutYourInformationPage_HW.getContinueButton().click();

        logger.info("Continue checkout");
        return checkoutOverviewPage_HW;
    }


}