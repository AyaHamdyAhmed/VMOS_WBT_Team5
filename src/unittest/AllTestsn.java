package unittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import vehicle.test.MainTestn;
import vehicle.test.StateTestn;

@RunWith(Suite.class)
@Suite.SuiteClasses({MainTestn.class,StateTestn.class})
public class AllTestsn {

}