package pages;

import baseEntities.BasePage;
import elements.Checkbox;
import elements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUserPage extends BasePage {
    private final static String pagePath = "/index.php?/admin/users/add";

    // Блок описания локаторов для элементов
    private final By headerTitleLabelLocator = By.className("page_title");
    private final By addProjectRadioButtonLocator = By.cssSelector(".form-group .radio .radio");
    ////div[@onclick]

    public AddUserPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    public RadioButton addProjectRadioButtonLocator() {
        return new RadioButton (driver, addProjectRadioButtonLocator);
    }
}
