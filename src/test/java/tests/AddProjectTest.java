package tests;

import baseEntities.BaseTest;
import elements.Checkbox;
import org.testng.annotations.Test;
import pages.AddProjectPage;
import pages.ProjectsPage;
import utils.configuration.ReadProperties;

public class AddProjectTest extends BaseTest {

    @Test
    public void checkboxTest() {

        loginStep.successLogin(
                ReadProperties.username(),
                ReadProperties.password()
        );

        AddProjectPage addProjectPage = new AddProjectPage(driver);
        addProjectPage.openPageByUrl();

        Checkbox checkbox = addProjectPage.getAddProjectsCheckbox();
        checkbox.setFlag();
        checkbox.removeFlag();
    }

}
