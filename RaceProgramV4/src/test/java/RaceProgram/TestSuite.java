package RaceProgram;

/**
 * Created by student on 2015/04/30.
 */

import RaceProgram.domain.CarsTest;
import RaceProgram.domain.ClassesTest;
import RaceProgram.domain.DriversTest;
import RaceProgram.domain.RaceTimesTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CarsTest.class,DriversTest.class,ClassesTest.class,
        RaceTimesTest.class})

public class TestSuite
{

}
