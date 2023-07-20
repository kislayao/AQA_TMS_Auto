package tests;

import baseEntities.BaseTest_HW;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutCompletePage_HW;
import pages.LoginPage_HW;
import utils.configuration.ReadProperties;

public class E2ETest_HW extends BaseTest_HW {

    @Test
    public void E2ETest() {

        new LoginPage_HW(driver)

                .login_HW(ReadProperties.usernameHW(), ReadProperties.passwordHW())
                .addToCart_HW()
                .removeButtonIsDisplayed()
                .openCart_HW()
                .checkout_HW()
                .fillingInWithValidData_HW()
                .continueCheckout()
                .finishCheckout();

        Assert.assertTrue(new CheckoutCompletePage_HW(driver).isPageOpened());

    }
}
