package data;

import org.testng.annotations.DataProvider;

public class StaticProvider {
    @DataProvider(name = "Data for sum test", parallel = true, indices = 2)
    // parallel - если в последствии будем паралеллизировать
    // indices - выполнится со вторым элементом массива
    public static Object[][] dataForSumTest() {
        return new Object[][]{
                {-2, -3, -5},
                {0, 0, 0},
                {2, 3, 5},
                {-1, 2, 1}
        };
    }

    @DataProvider(name = "Data for div INT test", parallel = true)
    public static Object[][] dataForDivIntTest() {
        return new Object[][]{
                {-2, -1, 2},
                {5, 5, 1},
                {6, -2, -3},
                {0, 2, 0}
        };
    }

}
