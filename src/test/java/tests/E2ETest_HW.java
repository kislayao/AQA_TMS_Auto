package tests;

import baseEntities.BaseTest_HW;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import helper.DataHelper;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class E2ETest_HW extends BaseTest_HW {


    @Test
    public void E2ETest() {

        loginStep_HW.successLogin_HW(DataHelper.getStandardUser()).isPageOpened();
        productsStep_HW.addToCart_HW();
        productsStep_HW.removeButtonIsDisplayed();
        productsStep_HW.openCart_HW().isPageOpened();
        cartStep_HW.checkProductIsInTheCart();
        cartStep_HW.checkout_HW().isPageOpened();
        checkoutYourInformationStep_HW.fillingInWithValidData_HW(DataHelper.getCommonUserData());
        checkoutYourInformationStep_HW.continueCheckout().isPageOpened();
        checkoutOverviewStep_HW.checkProductIsInTheOverview();
        checkoutOverviewStep_HW.finishCheckout().isPageOpened();

    }
}
