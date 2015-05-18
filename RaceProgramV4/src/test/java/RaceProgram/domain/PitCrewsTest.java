package RaceProgram.domain;

import RaceProgram.Conf.Factories.PitCrewsFactory;
import RaceProgram.Domain.PitCrews;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/05/08.
 */
public class PitCrewsTest
{
    @Test
    public void testCreatePitCrews() throws Exception
    {
        PitCrews pitCrews = PitCrewsFactory.createPitCrews(true,"TEST");

        Assert.assertEquals("TEST",pitCrews.getDriverName());
    }

    @Test
    public void testUpdatePitCrews() throws Exception
    {
        PitCrews pitCrews = PitCrewsFactory.createPitCrews(true,"TEST");

        PitCrews newPitCrews = new PitCrews.Builder("John").copy(pitCrews).answer(false).build();

        Assert.assertFalse(newPitCrews.getAnswer());
    }
}
