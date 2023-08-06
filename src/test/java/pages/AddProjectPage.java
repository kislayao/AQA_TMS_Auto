package pages;

import baseEntities.BasePage;
import elements.Checkbox;
import elements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProjectPage extends BasePage {
    private final static String pagePath = "/index.php?/admin/projects/add";

    // Блок описания локаторов для элементов
    private final By headerTitleLabelLocator = By.className("page_title");
    private final By addProjectCheckboxLocator = By.cssSelector("#show_announcement");
    private final By addProjectRadioButtonLocator = By.cssSelector(".add-project-row");

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

    public Checkbox getAddProjectCheckbox() {
        return new Checkbox (driver, addProjectCheckboxLocator);
    }

    public RadioButton getAddProjectRadioButton(){
        return new RadioButton(driver, addProjectRadioButtonLocator);
    }
}
