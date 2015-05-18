package RaceProgram.domain;

import RaceProgram.Conf.Factories.StandingsFactory;
import RaceProgram.Domain.Drivers;
import RaceProgram.Domain.Standings;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/05/08.
 */
public class StandingsTest
{
    @Test
    public void testCreateStandings() throws Exception
    {
        Standings standings = StandingsFactory.createStandings(5,null,null);

        Assert.assertEquals(5,standings.getPosition());
    }

    @Test
    public void testUpdateStandings() throws Exception
    {
        Standings standings = StandingsFactory.createStandings(5,null,null);

        Standings newStandings = new Standings.Builder(null).copy(standings).className(null).build();

        Assert.assertEquals(5,standings.getPosition());
    }
}
