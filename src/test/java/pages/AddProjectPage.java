package pages;

import baseEntities.BasePage;
import elements.Checkbox;
import elements.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProjectPage extends BasePage {
    private final static String pagePath = "/index.php?/admin/projects/add";

    // Блок описания локаторов для элементов
    private final By headerTitleLabelLocator = By.className("page_title");
    private final By projectsCheckboxLocator = By.cssSelector("#show_announcement");

    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    public Checkbox getAddProjectsCheckbox() {
        return new Checkbox (driver, projectsCheckboxLocator);
    }
}
