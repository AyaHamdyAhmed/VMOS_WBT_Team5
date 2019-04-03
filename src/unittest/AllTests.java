package unittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import vehicle.test.*;

@RunWith(Suite.class)
@SuiteClasses({StateTest.class,MainTest.class})
public class AllTests {

}
