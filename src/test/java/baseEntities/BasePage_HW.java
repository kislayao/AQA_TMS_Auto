package baseEntities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.configuration.ReadProperties;

public abstract class BasePage_HW {
    protected WebDriver driver;

    public BasePage_HW(WebDriver driver) {
        this.driver = driver;
    }

    public void openPageByUrl_HW(String pagePath) {
        driver.get(ReadProperties.getUrlHW() + pagePath);
    }

    protected abstract By getPageIdentifier();

    public boolean isPageOpened() {
        return driver.findElement(getPageIdentifier()).isDisplayed();
    }
}
