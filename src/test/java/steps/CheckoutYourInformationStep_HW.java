package steps;

import baseEntities.BaseStep_HW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutOverviewPage_HW;
import pages.CheckoutYourInformationPage_HW;

public class CheckoutYourInformationStep_HW extends BaseStep_HW {

    public CheckoutYourInformationStep_HW(WebDriver driver) {
        super(driver);
    }

    public CheckoutYourInformationPage_HW fillingInWithValidData_HW() {
        checkoutYourInformationPage_HW.fillInYourInfoData();
        return checkoutYourInformationPage_HW;
    }

    public CheckoutOverviewPage_HW continueCheckout(){
        checkoutYourInformationPage_HW.getContinueButton().click();
        return checkoutOverviewPage_HW;
    }


}