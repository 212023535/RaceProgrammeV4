package RaceProgram.repository;

import RaceProgram.App;
import RaceProgram.Domain.Standings;
import RaceProgram.Repositories.StandingsRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by student on 2015/04/30.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration

public class TestCrudStandings
{
    int pos;

    @Autowired
    StandingsRepository repository;

    @Test
    public void testCreate() throws Exception
    {
        Standings standings = new Standings.Builder(null).position(8).className(null).build();
        repository.save(standings);
        pos = standings.getPosition();
        Assert.assertNotNull(standings.getPosition());
    }

    @Test
    public void testRead() throws Exception
    {
        Standings standings = repository.findOne(pos);
        Assert.assertEquals(8, standings.getPosition());
    }

    @Test
    public void testUpdate() throws Exception {
        Standings standings = repository.findOne(pos);
        Standings newStandings = new Standings.Builder(null).position(2).className(null).build();
        repository.save(newStandings);
        Assert.assertEquals(2,newStandings.getPosition());
        Assert.assertEquals(8,standings.getPosition());
    }

    @Test
    public void testDelete() throws Exception
    {
        Standings standings = repository.findOne(pos);
        repository.delete(standings);
        Standings newStandings = repository.findOne(pos);
        Assert.assertNull(newStandings);
    }

}
