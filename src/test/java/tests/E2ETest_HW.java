package tests;

import baseEntities.BaseTest_HW;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class E2ETest_HW extends BaseTest_HW {

    @Test (description = "End to end test")
    @Description ("End to end test includes next steps:\n" +
            "1. Logging in\n" +
            "2. Adding 1 item (Sauce Labs Bike Light) to cart\n" +
            "3. Opening the cart\n" +
            "4. Checking that added item is in the cart\n" +
            "5. Clicking 'Checkout' button\n" +
            "6. Filling in all the fields with valid data\n" +
            "7. Clicking 'Continue' button\n" +
            "8. Checking that selected on the 2nd step item is displayed on the Overview page\n" +
            "9. Clicking 'Finish' button\n" +
            "10. Checking that 'Complete' page is opened")
    @Severity(SeverityLevel.CRITICAL)
    public void E2ETest() {
        Assert.assertTrue(
                loginStep_HW.successLogin_HW(
                        ReadProperties.usernameHW(), ReadProperties.passwordHW()
                ).isPageOpened()

        );
        Assert.assertTrue(productsStep_HW.addToCart_HW().isPageOpened());
        Assert.assertTrue(productsStep_HW.removeButtonIsDisplayed().isPageOpened());
        Assert.assertTrue(productsStep_HW.openCart_HW().isPageOpened());
        Assert.assertTrue(cartStep_HW.checkProductIsInTheCart());
        Assert.assertTrue(cartStep_HW.checkout_HW().isPageOpened());
        Assert.assertTrue(checkoutYourInformationStep_HW.fillingInWithValidData_HW().isPageOpened());
        Assert.assertTrue(checkoutYourInformationStep_HW.continueCheckout().isPageOpened());
        Assert.assertTrue(checkoutOverviewStep_HW.checkProductIsInTheOverview());
        Assert.assertTrue(checkoutOverviewStep_HW.finishCheckout().isPageOpened());
    }

    @Test (description = "Login with 'test' password")
    @Description ("User can login using password 'test'")
    @Severity(SeverityLevel.BLOCKER)
    public void loginWithTestPassword() {
        Assert.assertTrue(
                loginStep_HW.successLogin_HW(
                        ReadProperties.usernameHW(), "test"
                ).isPageOpened()

        );
    }

}
