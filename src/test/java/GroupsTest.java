import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsTest {

    @Test(groups = "smoke")
    public void stepB() {
        System.out.println("stepB..");
    }

    @Test(groups = "regression", dependsOnGroups = "smoke")
    public void stepA2() {
        System.out.println("stepA2..");
        Assert.assertTrue(false);
    }

    @Test(groups = "regression")
    public void stepA11() {
        System.out.println("stepA11..");
    }

    @Test(groups = {"smoke", "regression"})
    public void stepD() {
        System.out.println("stepD..");
    }
}
