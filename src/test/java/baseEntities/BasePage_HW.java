package baseEntities;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public abstract class BasePage_HW {
    public BasePage_HW() {
    }

    public void openPageByUrl_HW(String pagePath) {
        open(pagePath);
    }

    protected abstract By getPageIdentifier();

    public void isPageOpened() {
        $(getPageIdentifier()).shouldBe(visible);
    }
}