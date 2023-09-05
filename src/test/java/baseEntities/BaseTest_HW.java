package baseEntities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.*;
import utils.configuration.ReadProperties;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest_HW {
    protected WebDriver driver;
    protected LoginStep_HW loginStep_HW;
    protected ProductsStep_HW productsStep_HW;
    protected CartStep_HW cartStep_HW;
    protected CheckoutYourInformationStep_HW checkoutYourInformationStep_HW;
    protected CheckoutOverviewStep_HW checkoutOverviewStep_HW;
    private CheckoutCompleteStep_HW checkoutCompleteStep_HW;

    //static Logger logger = Logger.getLogger(BaseTest_HW.class);


    @BeforeMethod
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        org.apache.log4j.BasicConfigurator.configure();

        Configuration.baseUrl = ReadProperties.getUrlHW();
        Configuration.timeout = 8000;
        //Configuration.browser = Browsers.CHROME;
        Configuration.browserSize = "1920x1080";
        Configuration.fastSetValue = true;
        Configuration.headless = false;
        //Configuration.assertionMode = SOFT;

        loginStep_HW = new LoginStep_HW();
        productsStep_HW = new ProductsStep_HW();
        cartStep_HW = new CartStep_HW();
        checkoutYourInformationStep_HW = new CheckoutYourInformationStep_HW();
        checkoutOverviewStep_HW = new CheckoutOverviewStep_HW();
        checkoutCompleteStep_HW = new CheckoutCompleteStep_HW();

        //open("/");
        open(ReadProperties.getUrlHW());

        //logger.info("Browser is started");
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }

}
