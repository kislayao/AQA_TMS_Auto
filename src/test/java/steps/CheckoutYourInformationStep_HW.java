package steps;

import baseEntities.BaseStep_HW;
import models.UserData;
import org.openqa.selenium.WebDriver;
import pages.CheckoutOverviewPage_HW;
import pages.CheckoutYourInformationPage_HW;

public class CheckoutYourInformationStep_HW extends BaseStep_HW {

    public CheckoutYourInformationStep_HW() {
        super();
    }

    public CheckoutYourInformationPage_HW fillingInWithValidData_HW(UserData userData) {
        checkoutYourInformationPage_HW.fillInYourInfoData(userData);
        return checkoutYourInformationPage_HW;
    }

    public CheckoutOverviewPage_HW continueCheckout(){
        checkoutYourInformationPage_HW.getContinueButton().click();
        return checkoutOverviewPage_HW;
    }


}
