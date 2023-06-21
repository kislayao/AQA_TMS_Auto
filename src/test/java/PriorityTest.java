import org.testng.annotations.Test;

public class PriorityTest {

    // тесты выполняются по алфавиту + цифры рааспознются не как цифры
    @Test (priority = 1)
    public void stepB(){
        System.out.println("stepB..");
    }
    @Test
    public void stepA2(){
        System.out.println("stepA2..");
    }
    @Test
    public void stepA11(){
        System.out.println("stepA11..");
    }
    @Test
    public void stepD(){
        System.out.println("stepD..");
    }
    @Test
    public void stepC(){
        System.out.println("stepC..");
    }
}
