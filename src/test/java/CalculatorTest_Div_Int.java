import data.StaticProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest_Div_Int extends BaseTest{

    @Test(priority = 1, enabled = false)
    public void div_by1(){
        int expectedValue = 5;
        int actualValue = calculator.div(4,1);

        Assert.assertEquals(actualValue, expectedValue, "Values don't match");
    }

    @Test (description = "Test with timeout", testName = "Timeout test", timeOut = 1000, groups = "smoke")
    public void div_1() throws InterruptedException {
        Thread.sleep(950);
        int expectedValue = 5;
        int actualValue = calculator.div(5,1);

        Assert.assertEquals(actualValue, expectedValue, "Values don't match");
        Assert.assertTrue(false);
    }

    @Test(invocationCount = 3, invocationTimeOut = 200, threadPoolSize = 3, dependsOnMethods = "exceptionTestDiv",
    groups = "smoke")
    public void invocationCountTestDiv() throws InterruptedException {
        Thread.sleep(500);
        int expectedValue = 10;
        int actualValue = calculator.div(120,12);

        Assert.assertEquals(actualValue, expectedValue, "Values don't match");
    }

    @Test(expectedExceptions = ArithmeticException.class, alwaysRun = true, groups = "regression")
    public void exceptionTestDiv() {
        calculator.div(1420,0);
    }

    @Test(dependsOnGroups = "smoke")
    public void div_negative_number(){
        int expectedValue = -2;
        int actualValue = calculator.div(-4,2);
        Assert.assertEquals(actualValue, expectedValue, "Values don't match");
    }

    @Test (dataProvider = "Data for div INT test", dataProviderClass = StaticProvider.class, threadPoolSize = 4,
            groups = "smoke")
    public void dataProviderTest_DivInt(int a, int b, int expectedResult) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(calculator.div(a,b), expectedResult, "Values don't match");
    }

}
