package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.*;
import utils.configuration.ReadProperties;

public class BaseTest_HW {
    protected WebDriver driver;
    protected LoginStep_HW loginStep_HW;
    protected ProductsStep_HW productsStep_HW;
    protected CartStep_HW cartStep_HW;
    protected CheckoutYourInformationStep_HW checkoutYourInformationStep_HW;
    protected CheckoutOverviewStep_HW checkoutOverviewStep_HW;
    private CheckoutCompleteStep_HW checkoutCompleteStep_HW;


    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
        loginStep_HW = new LoginStep_HW(driver);
        productsStep_HW = new ProductsStep_HW(driver);
        cartStep_HW = new CartStep_HW(driver);
        checkoutYourInformationStep_HW = new CheckoutYourInformationStep_HW(driver);
        checkoutOverviewStep_HW = new CheckoutOverviewStep_HW(driver);
        checkoutCompleteStep_HW = new CheckoutCompleteStep_HW(driver);
        driver.get(ReadProperties.getUrlHW());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
