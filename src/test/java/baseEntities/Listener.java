package baseEntities;

import org.testng.ITestListener;

public class Listener implements ITestListener {
 public void onTestFailure(ITestListener result){
     System.out.println("Make a screenshot!");
 }
}
