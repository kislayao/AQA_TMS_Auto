import org.testng.annotations.*;

public class BaseTest {

    protected Calculator calculator;

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass: ...");
        calculator = new Calculator();
        calculator.setLevel(this.getClass().toString());
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("BeforeGroups: ...");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest: ...");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod: ...");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite: ...");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass: ...");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("AfterGroups: ...");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest: ...");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod: ...");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite: ...");
    }
}
