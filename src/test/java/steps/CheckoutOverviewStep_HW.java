package steps;

import baseEntities.BaseStep_HW;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebDriver;
import pages.CheckoutCompletePage_HW;
import pages.CheckoutOverviewPage_HW;

import static com.codeborne.selenide.Condition.visible;

public class CheckoutOverviewStep_HW extends BaseStep_HW {

    public CheckoutOverviewStep_HW() {
        super();
    }

    public CheckoutCompletePage_HW finishCheckout (){
        checkoutOverviewPage_HW.getFinishButton().click();
        return checkoutCompletePage_HW;
    }

    public boolean checkProductIsInTheOverview(){
        productsPage_HW.getItemTitle().shouldBe(visible);
        return true;
    }

}
