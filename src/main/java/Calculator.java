public class Calculator {
    private String level;
    public int getSum(int a, int b){
        return a+b;
    }

    public int div(int a, int b){
        try {
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("division by zero is forbidden");
        }
        return a / b;
    }

    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }

}
