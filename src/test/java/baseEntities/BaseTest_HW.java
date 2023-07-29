package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import steps.*;
import utils.configuration.ReadProperties;

@Listeners(InvokedListener.class)
public class BaseTest_HW {
    protected WebDriver driver;
    protected LoginStep_HW loginStep_HW;
    protected ProductsStep_HW productsStep_HW;
    protected CartStep_HW cartStep_HW;
    protected CheckoutYourInformationStep_HW checkoutYourInformationStep_HW;
    protected CheckoutOverviewStep_HW checkoutOverviewStep_HW;
    private CheckoutCompleteStep_HW checkoutCompleteStep_HW;


    @BeforeMethod
    public void setUp (ITestContext iTestContext) {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
        this.setDriverToContext(iTestContext, driver);
        loginStep_HW = new LoginStep_HW(driver);
        productsStep_HW = new ProductsStep_HW(driver);
        cartStep_HW = new CartStep_HW(driver);
        checkoutYourInformationStep_HW = new CheckoutYourInformationStep_HW(driver);
        checkoutOverviewStep_HW = new CheckoutOverviewStep_HW(driver);
        checkoutCompleteStep_HW = new CheckoutCompleteStep_HW(driver);
        driver.get(ReadProperties.getUrlHW());
    }

    private void setDriverToContext(ITestContext iTestContext, WebDriver driver) {
        iTestContext.setAttribute("WebDriver", driver);
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            System.out.println("Make screenshot");
        }
        driver.quit();
    }

}
