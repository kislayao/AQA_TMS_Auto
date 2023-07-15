import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class LocatorsHW {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void basicLocatorsTest_HW() {
        driver.get(ReadProperties.getUrlHW());

        driver.findElement(By.id("cars")).click();

        driver.findElement(By.name("pickup-time")).click();

        driver.findElement(By.className("js-header-login-link")).click();

        driver.findElement(By.linkText("Правилами и условиями")).click();

        driver.findElement(By.partialLinkText(" конфиденциальности")).click();

        driver.findElement(By.tagName("label"));
    }

    @Test
    public void cssSelectors_HW() {
        driver.get(ReadProperties.getUrlHW());



    }

}
