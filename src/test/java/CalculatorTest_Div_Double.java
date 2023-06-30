import data.StaticProvider;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorTest_Div_Double extends BaseTest{

    private double a = 3.0;
    private double b = 1.0;

    @Test (groups = "smoke", dataProvider = "Data for div DOUBLE test", dataProviderClass = StaticProvider.class)
    public void dataProviderTest_DivDouble(double a, double b, double expectedResult) {
        Assert.assertEquals(calculator.div(a,b), expectedResult, "Values don't match");
    }

    @Test(groups = "regression")
    public void divideByZeroPositive() {
        double actualValue = calculator.div(12.5, 0);

        Assert.assertEquals(actualValue, Double.POSITIVE_INFINITY);
    }
    @Test(groups = "regression")
    public void divideByZeroNegative() {
        double actualValue = calculator.div(-12.5, 0);

        Assert.assertEquals(actualValue, Double.NEGATIVE_INFINITY);
    }

    @Test(groups = "regression")
    public void divideDoubleZeroByZero() {
        double actualValue = calculator.div(0.0,0);

        Assert.assertEquals(actualValue, Double.NaN);
    }

    @Parameters({"firstDigit-value","secondDigit-value"})
    @Test
    public void parametersTest(@Optional("2.4") double firstDigit,  @Optional("0.6") double secondDigit){
        double expectedValue = 4.0;
        double actualValue = calculator.div(firstDigit,secondDigit);

        Assert.assertEquals(actualValue, expectedValue, "Values don't match");
    }

    @Test (retryAnalyzer = Retry.class)
    public void retryDivDouble(){
        double expectedValue = 2.0;

        if (calculator.div(a,b) == expectedValue){
            Assert.assertTrue(true);
        } else {
            a++;
            b++;
            Assert.assertTrue(false);
        }
    }

}
