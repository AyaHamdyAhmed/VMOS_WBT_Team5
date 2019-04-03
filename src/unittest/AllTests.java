package unittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

<<<<<<< HEAD
import vehicle.app.*;
import vehicle.test.MainTest;
=======
import vehicle.test.*;
>>>>>>> master

@RunWith(Suite.class)
@SuiteClasses({StateTest.class,MainTest.class})
public class AllTests {

}
