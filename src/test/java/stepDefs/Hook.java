package stepDefs;

import baseEntities.BaseTest_HW;
import factory.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends BaseTest_HW {
    private BaseTest_HW baseTest;

    public Hook(BaseTest_HW baseTest) {
        this.baseTest = baseTest;
    }

    @Before
    public void initGuiScenario(Scenario scenario) {
        baseTest.driver = new BrowserFactory().getDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Attach screenshot");
        }
        baseTest.driver.quit();
    }
}