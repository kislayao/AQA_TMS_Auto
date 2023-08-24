package stepDefs;

import baseEntities.BaseTest_HW;
import io.cucumber.java.en.Then;
import pages.CheckoutCompletePage_HW;
import pages.CheckoutOverviewPage_HW;

public class CheckoutCompleteSteps extends BaseTest_HW {

    private BaseTest_HW baseTest;
    private CheckoutCompletePage_HW checkoutCompletePage_hw;

    public CheckoutCompleteSteps (BaseTest_HW baseTest) {
        this.baseTest = baseTest;
        checkoutCompletePage_hw = new CheckoutCompletePage_HW(driver);
    }

    @Then("complete checkout page is displayed")
    public void checkCompleteCheckoutPageIsOpened (){
        checkoutCompletePage_hw.isPageOpened();
    }
}
