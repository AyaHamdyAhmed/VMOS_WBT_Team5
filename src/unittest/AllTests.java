package unittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import vehicle.app.*;
import vehicle.test.MainTest;

@RunWith(Suite.class)
@SuiteClasses({StateTest.class,MainTest.class})
public class AllTests {

}
