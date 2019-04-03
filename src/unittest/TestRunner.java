package unittest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
	
  static void main() {
	 Result result = new JUnitCore().run(AllTests.class);
	 System.out.println("The number of test cases passed in MainTest class" + result.getRunCount());
	 System.out.println("The number of test cases failed in MainTest class" + result.getRunCount());

 }
}
