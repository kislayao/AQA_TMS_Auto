package baseEntities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import services.WaitService;
import utils.configuration.ReadProperties;

public abstract class BasePage_HW {
    protected WebDriver driver;
    protected WaitService waitService;

    public BasePage_HW(WebDriver driver) {
        this.driver = driver;

        this.waitService = new WaitService(driver);
        PageFactory.initElements(driver, this);
    }

    public void openPageByUrl_HW(String pagePath) {
        driver.get(ReadProperties.getUrlHW() + pagePath);
    }

    protected abstract By getPageIdentifier();

    public boolean isPageOpened() {
        return driver.findElement(getPageIdentifier()).isDisplayed();
    }
}
