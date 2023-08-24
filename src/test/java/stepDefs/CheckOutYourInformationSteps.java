package stepDefs;

import baseEntities.BaseTest_HW;
import io.cucumber.java.en.When;
import pages.CartPage_HW;
import pages.CheckoutYourInformationPage_HW;

public class CheckOutYourInformationSteps extends BaseTest_HW {

    private BaseTest_HW baseTest;
    private CheckoutYourInformationPage_HW checkoutYourInformationPage_hw;

    public CheckOutYourInformationSteps(BaseTest_HW baseTest) {
        this.baseTest = baseTest;
        checkoutYourInformationPage_hw = new CheckoutYourInformationPage_HW(driver);

    }

    @When("user fills in first name {} last name {} and postal code {}")
    public void fillInYourInfoData(String firstName, String lastName, String postalCode){
        checkoutYourInformationPage_hw.getFirstNameInput().sendKeys(firstName);
        checkoutYourInformationPage_hw.getLastNameInput().sendKeys(lastName);
        checkoutYourInformationPage_hw.getPostalCodeInput().sendKeys(postalCode);
    }

    @When("user clicks continue checkout")
    public void continueCheckout(){
        checkoutYourInformationPage_hw.getContinueButton().click();
    }


}
