package unittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import vehicle.test.StateTest;

@RunWith(Suite.class)
@SuiteClasses({StateTest.class})
public class AllTests {

}
