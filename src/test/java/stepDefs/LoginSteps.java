package stepDefs;

import baseEntities.BaseTest_HW;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage_HW;
import utils.configuration.ReadProperties;

public class LoginSteps extends BaseTest_HW{
    private BaseTest_HW baseTest;
    private LoginPage_HW loginPage_hw;

    public LoginSteps(BaseTest_HW baseTest) {
        this.baseTest = baseTest;
    }

    @Given("start browser")
    public void startBrowser() {
    }

    @Given("open login page")
    public void openLoginPage() {
        driver.get(ReadProperties.getUrlHW());
    }

    @When("user logged in with username {} and password {}")
    public void setUsernameAndPassword(String username, String password) {
        loginPage_hw = new LoginPage_HW(driver);
        loginPage_hw.getUserNameInput().sendKeys(username);
        loginPage_hw.getPswInput().sendKeys(password);
        loginPage_hw.getLoginButton().click();
    }

}

