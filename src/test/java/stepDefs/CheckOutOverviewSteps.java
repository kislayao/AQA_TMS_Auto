package stepDefs;

import baseEntities.BaseTest_HW;
import io.cucumber.java.en.Then;
import pages.CheckoutOverviewPage_HW;


public class CheckOutOverviewSteps extends BaseTest_HW {

    private BaseTest_HW baseTest;
    private CheckoutOverviewPage_HW checkoutOverviewPage_hw;

    public CheckOutOverviewSteps (BaseTest_HW baseTest) {
        this.baseTest = baseTest;
        checkoutOverviewPage_hw = new CheckoutOverviewPage_HW(driver);
    }

    @Then("user finishes checkout")
    public void finishCheckout (){
        checkoutOverviewPage_hw.getFinishButton().click();
    }



}
