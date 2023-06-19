import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest{
    @Test
    public void sumTest_1(){
        int expectedValue = 5;
        int actualValue = calculator.getSum(2,3);

        Assert.assertEquals(actualValue, expectedValue, "Values don't match");
    }
}
