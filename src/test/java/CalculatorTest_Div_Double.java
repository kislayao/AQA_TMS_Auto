import data.StaticProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest_Div_Double extends BaseTest{

    @Test (groups = "smoke", dataProvider = "Data for div DOUBLE test", dataProviderClass = StaticProvider.class)
    public void dataProviderTest_DivDouble(double a, double b, double expectedResult) {
        Assert.assertEquals(calculator.div(a,b), expectedResult, "Values don't match");
    }

    @Test(groups = "regression")
    public void divideByZero() {
        double actualValue = calculator.div(12.5, 0);

        Assert.assertEquals(actualValue, Double.POSITIVE_INFINITY);
    }

}
