package RaceProgram.domain;

import RaceProgram.Conf.Factories.RaceTimesFactory;
import RaceProgram.Domain.RaceTimes;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/16.
 */
public class RaceTimesTest
{
    @Test
    public void testRaceTimes() throws Exception
    {
        RaceTimes raceTimes = new RaceTimes.Builder(null).raceTime("09:15").build();
        Assert.assertEquals("09:15",raceTimes.getRaceTime());
    }

    @Test
    public void testCreateRaceTimes() throws Exception
    {

        RaceTimes raceTimes = RaceTimesFactory.createRaceTimes("13:20",null);

        Assert.assertEquals("13:20",raceTimes.getRaceTime());
    }

    @Test
    public void testUpdateRaceTimes() throws Exception
    {

        RaceTimes raceTimes = RaceTimesFactory.createRaceTimes("13:20",null);

        RaceTimes newRaceTimes = new RaceTimes.Builder(null)
                                                .copy(raceTimes)
                                                .raceTime("14:00")
                                                .build();
        Assert.assertEquals("13:20",raceTimes.getRaceTime());
        Assert.assertEquals("14:00",newRaceTimes.getRaceTime());
    }
}
