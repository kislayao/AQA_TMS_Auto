package tests;

import baseEntities.BaseTest;
import elements.Checkbox;
import elements.RadioButton;
import org.testng.annotations.Test;
import pages.AddProjectPage;
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

        Checkbox checkbox = addProjectPage.getAddProjectCheckbox();
        checkbox.setFlag();
        checkbox.removeFlag();
    }

    @Test
    public void radioButtonTest() throws InterruptedException {
        loginStep.successLogin(
                ReadProperties.username(),
                ReadProperties.password()
        );

        AddProjectPage addProjectPage = new AddProjectPage(driver);
        addProjectPage.openPageByUrl();

        RadioButton radioButton = addProjectPage.getAddProjectRadioButton();
        //radioButton.getRadioButtons(0).getRB().click();
        radioButton.test(1);

        Thread.sleep(5000);
    }

}
