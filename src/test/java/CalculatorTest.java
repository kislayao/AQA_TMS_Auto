import data.StaticProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CalculatorTest extends BaseTest{
    @Test
    public void sumTest_1(){
        int expectedValue = 5;
        int actualValue = calculator.getSum(2,3);

        Assert.assertEquals(actualValue, expectedValue, "Values don't match");
    }

    @Test(timeOut = 1000)
    public void timeOutTest() throws InterruptedException {
        Thread.sleep(1000);
        int expectedValue = 5;
        int actualValue = calculator.getSum(2,3);

        Assert.assertEquals(actualValue, expectedValue, "Values don't match");
    }


    @Test(invocationCount = 3, invocationTimeOut = 1000, threadPoolSize = 3)
    // invocationTimeOut в данном случае не учитывается
    public void invocationCountTest() throws InterruptedException {
        Thread.sleep(500);
        int expectedValue = 5;
        int actualValue = calculator.getSum(2,3);

        Assert.assertEquals(actualValue, expectedValue, "Values don't match");
    }

    @Test(expectedExceptions = NullPointerException.class)
    // прописываем ошибку которую ожидаем
    public void exceptionTest() throws InterruptedException {
        List list = null;
        int size = list.size();
    }

    @Test (dataProvider = "Data for sum test", dataProviderClass = StaticProvider.class, threadPoolSize = 2)
    // добавить потоки для одновременного выполнения
    public void dataProviderTest(int a, int b, int expectedResult) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(calculator.getSum(a,b), expectedResult, "Values don't match");
    }

}
