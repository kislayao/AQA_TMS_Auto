import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {

    @Test
    public void stepB(){
        System.out.println("stepB..");
    }
    @Test (dependsOnMethods = "stepB")
    // выполняется после выполнения теста от которого зависит
    // первыми выполняются методы без зависимости плюс по сторировке
    public void stepA2(){
        System.out.println("stepA2..");
        Assert.assertTrue(false);
    }
    @Test (dependsOnMethods = "stepA2", alwaysRun = true)
    public void stepA11(){
        System.out.println("stepA11..");
    }
    @Test (dependsOnMethods = {"stepA2", "stepA11"})
    public void stepD(){
        System.out.println("stepD..");
    }
    @Test
    public void stepC(){
        System.out.println("stepC..");
    }
}
